class Solution {
  public boolean isTrue(int[] ary1, int[] ary2, double compareM, double compareN) {
    int x1 = ary1[0];
    int x2 = ary2[0];
    int y1 = ary1[1];
    int y2 = ary2[1];
    double m = getM(x1, y1, x2, y2);
    double n = getN(x1, y1, m);
    if ((m == compareM && n != compareN) || (m == compareM && n == compareN)) {
      return true;
    }
    return false;
  }

  public double getM(int x1, int y1, int x2, int y2) {
    return (double) (y2 - y1) / (double)(x2 - x1);
  }

  public double getN(int x1, int y1, double m) {
    return (double)(y1 - m * x1);
  }

  public int solution(int[][] dots) {
    int answer = 0;

    int x1 = dots[0][0];
    int y1 = dots[0][1];
    for (int j = 1; j < dots.length; j++) {
      int x2 = dots[j][0];
      int y2 = dots[j][1];
      double m = getM(x1, y1, x2, y2);
      double n = getN(x1, y1, m);
      if (j == 1)
        if (isTrue(dots[2], dots[3], m, n))
          answer++;
      if (j == 2)
        if (isTrue(dots[1], dots[3], m, n))
          answer++;
      if (j == 3)
        if (isTrue(dots[1], dots[2], m, n))
          answer++;
    }
    return answer > 0 ? 1 : 0;
  }
}