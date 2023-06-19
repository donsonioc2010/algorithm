import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {

  private Map<Character, List<String>> word;

  // 소문자 알파벳 strings
  public String[] solution(String[] strings, int n) {
    word = new HashMap<>();

    List<String> answer = new ArrayList<>();
    for (int i = 0; i <= 'z' - 'a'; i++) {
      word.put((char) ('a' + i), new ArrayList<>());
    }

    for (int i = 0; i < strings.length; i++) {
      word.get(strings[i].charAt(n)).add(strings[i]);
    }

    for (int i = 0; i <= 'z' - 'a'; i++) {
      List<String> tempList = word.get((char) ('a' + i));
      tempList.sort(Comparator.naturalOrder());
      for (int j = 0; j < tempList.size(); j++) {
        answer.add(tempList.get(j));
      }
    }

    return answer.toArray(String[]::new);
  }
}