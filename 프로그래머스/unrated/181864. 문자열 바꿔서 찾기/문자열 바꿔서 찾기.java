class Solution {
  public int solution(String myString, String pat) {
    char[] chars = myString.toUpperCase().toCharArray();
    for (int i = 0; i < chars.length; i++) {
      if (chars[i] == 'A')
        chars[i] = 'B';
      else
        chars[i] = 'A';
    }
    return String.valueOf(chars).contains(pat) ? 1 : 0;
  }
}
