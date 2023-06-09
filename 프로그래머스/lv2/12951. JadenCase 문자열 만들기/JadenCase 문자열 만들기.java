class Solution {
  public String solution(String s) {
    boolean isFirst = true;
    s = s.toLowerCase();
    StringBuffer sb = new StringBuffer();
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      if (c == ' ') {
        isFirst = true;
      } else {
        if ((c >= 'a' && c <= 'z') && isFirst) {
          c = Character.toUpperCase(c);
        }
        isFirst = false;
      }
      sb.append(c);
    }
    return sb.toString();
  }
}