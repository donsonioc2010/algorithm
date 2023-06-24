import java.util.HashSet;
import java.util.Set;

class Solution {
  public static void main(String[] args) {
    System.out.println(new Solution().solution("zzzzz", "a", 1));
    System.out.println(new Solution().solution("aukks", "wbqd", 5));
  }

  private Set<Character> skipSet = new HashSet<>();

  public String solution(String s, String skip, int index) {
    skip.chars().forEach(c -> skipSet.add((char) c));

    StringBuilder sb = new StringBuilder();
    for (int idx = 0; idx < s.length(); idx++) {
      int c = s.charAt(idx);
      int tempIndex = 0;
      while (tempIndex != index) {
        c++;
        if (c > 'z') {
          c = c - 26;
        }
        if (!skipSet.contains((char) (c))) {
          tempIndex++;
        }
      }
      sb.append((char) c);
    }

    return sb.toString();
  }
}