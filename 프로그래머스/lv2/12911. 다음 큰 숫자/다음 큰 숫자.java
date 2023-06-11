class Solution {
  public int solution(int n) {
    if (n == 0)
      return 0;
    if (n == 1)
      return 2;

    int binaryOneCntNumByN = getOneCnt(n);
    for (int i = n + 1;; i++) {
      int getICnt = getOneCnt(i);
      if (binaryOneCntNumByN == getICnt)
        return i;
    }
  }

  private static int getOneCnt(int n) {
    int cnt = 0;
    while (n >= 2) {
      cnt = n % 2 == 1 ? cnt + 1 : cnt;
      n /= 2;
    }
    return n == 1 ? cnt + 1 : cnt;
  }
}