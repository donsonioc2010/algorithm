class Solution {
  String[] numAry = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

  public int solution(String s) {
    for (int i = 0; i <= 9; i++) {
      s = s.replace(numAry[i], String.valueOf(i));
    }
    return Integer.parseInt(s);
  }
}