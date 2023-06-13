import java.util.ArrayList;
import java.util.List;

class Solution {
  public int[] solution(String s) {
    List<Integer> answer = new ArrayList<>();
    for (int i = 0; i < s.length(); i++) {
      int wordCnt = 0;
      Boolean isSameWord = false;
      for (int j = i - 1; j >= 0; j--) {
        wordCnt++;
        if (s.charAt(i) == s.charAt(j)){
          isSameWord = true;
            break;
        }
      }

      answer.add(isSameWord ? wordCnt : -1);
    }
    return answer.stream().mapToInt(i -> i).toArray();
  }
}