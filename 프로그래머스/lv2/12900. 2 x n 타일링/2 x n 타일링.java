class Solution {
  public int solution(int n) {
    if (n <= 1) {
      return n;
    }
    long[] ary = new long[n + 1];
    ary[0] = (long) 1;
    ary[1] = (long) 1;
    for (int i = 2; i <= n; i++) {
      ary[i] = (ary[i - 2] + ary[i - 1]) % 1000000007;
    }
    return (int) ary[n];
  }
}
