class Solution {
  public int solution(int[][] dots) {
    int xMin = Integer.MAX_VALUE, yMin = Integer.MAX_VALUE;
    int xMax = Integer.MIN_VALUE, yMax = Integer.MIN_VALUE;

    for (int i = 0; i < 4; i++) {
      xMin = Math.min(dots[i][1], xMin);
      xMax = Math.max(dots[i][1], xMax);

      yMin = Math.min(dots[i][0], yMin);
      yMax = Math.max(dots[i][0], yMax);
    }

    return (yMax - yMin) * (xMax - xMin);
  }
}