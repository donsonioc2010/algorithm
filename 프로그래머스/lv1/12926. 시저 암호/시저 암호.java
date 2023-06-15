class Solution {
  public String solution(String s, int n) {
    StringBuffer sb = new StringBuffer();

    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      if (c == ' ') {
        sb.append(c);
        continue;
      }
      if (c >= 'a' && c <= 'z') {
        c = (char) (c + n);
        if (c > 'z')
          c = (char) (96 + (c - 122));
      } else {
        c = (char) (c + n);
        if (c > 'Z') {
          c = (char) (64 + (c - 90));
        }
      }
      sb.append(c);
    }
    return sb.toString();
  }
}