class Solution {
  public String solution(String s) {
    return s.length() % 2 == 1 ? String.valueOf(
        s.charAt(s.length() / 2)) : s.substring(s.length() / 2 - 1, s.length() / 2 + 1);
  }
}