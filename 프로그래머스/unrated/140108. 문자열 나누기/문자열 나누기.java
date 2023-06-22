import java.util.ArrayList;

class Solution {
  public static void main(String[] args) {
    System.out.println(new Solution().solution("banana"));
  }

  public int solution(String s) {
    ArrayList<String> word = new ArrayList<>();
    while (true) {
      if ("".equals(s)) {
        return word.size();
      }
      char x = s.charAt(0);
      int xCnt = 0;
      int notXCnt = 0;
      for (int i = 0; i <= s.length(); i++) {
        if (i == s.length()) {
          word.add(s);
          return word.size();
        }
        if (s.charAt(i) == x) {
          xCnt++;
        } else {
          notXCnt++;
        }
        if (xCnt == notXCnt) {
          word.add(s.substring(0, i + 1));
          s = s.substring(i + 1, s.length());
          break;
        }
      }
    }
  }
}