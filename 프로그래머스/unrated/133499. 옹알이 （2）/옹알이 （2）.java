import java.util.List;

class Solution {
  public static void main(String[] args) {
    System.out.println(new Solution().solution(new String[] { "aya", "yee", "u",
        "maa" }));
    System.out.println(new Solution().solution(new String[] { "yayae" }));

  }

  public int solution(String[] babbling) {
    List<String> word = List.of("aya", "ye", "woo", "ma");

    int answer = 0;
    for (int i = 0; i < babbling.length; i++) {
      String temp = babbling[i];

      boolean repeatWord = false;
      for (int j = 0; j < word.size(); j++) {
        if (temp.contains(word.get(j).repeat(2))) {
          repeatWord = true;
          break;
        }
      }

      if (repeatWord) {
        continue;
      }

      for (int j = 0; j < word.size(); j++) {
        if (temp.contains(word.get(j))) {
          temp = temp.replace(word.get(j), "  ");
          j = 0;
        }
      }

      if (temp.trim().equals("")) {
        answer++;
      }
    }

    return answer;
  }
}