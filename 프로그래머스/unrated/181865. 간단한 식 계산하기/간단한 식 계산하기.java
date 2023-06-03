class Solution {
  public int solution(String binomial) {
    String[] ary = binomial.split(" ");
    int a = Integer.parseInt(ary[0]);
    int b = Integer.parseInt(ary[2]);
    switch (ary[1]) {
      case "+":
        return a + b;
      case "-":
        return a - b;
      default:
        return a * b;
    }
  }
}