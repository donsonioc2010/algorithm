class Solution {
  public static void main(String[] args) {
    new Solution().solution("3x + 7 + x");
  }

  public String solution(String polynomial) {
    String[] ary = polynomial.replace(" + ", "b").split("b");
    int xNum = 0;
    int num = 0;

    for (String str : ary)
      if (str.contains("x"))
        if ("x".equals(str))
          xNum++;
        else
          xNum += Integer.parseInt(str.replace("x", ""));
      else
        num += Integer.parseInt(str);

    String answer = xNum == 0 ? "" : xNum == 1 ? "x" : xNum + "x";
    if (num == 0)
      return answer;
    else if (answer.equals(""))
      return num + "";
    else
      return answer + " + " + num;
  }
}