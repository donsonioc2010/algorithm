class Solution {
  public int solution(int input) {
    long num = (long) input;
    if (num == 1)
      return 0;

    for (int i = 1; i <= 500; i++) {
      System.out.println(i + " " + num);
      if (num % 2 == 0)
        num /= 2;
      else
        num = num * 3 + 1;
      if (num == 1)
        return i;
    }
    return -1;
  }
}