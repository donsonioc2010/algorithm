
class Solution {
  public int solution(int[][] sizes) {
    int wmax = Integer.MIN_VALUE;
    int hmax = Integer.MIN_VALUE;

    for (int i = 0; i < sizes.length; i++) {
      int w = sizes[i][0];
      int h = sizes[i][1];
      sizes[i][0] = Math.max(w, h);
      sizes[i][1] = Math.min(w, h);

      wmax = Math.max(sizes[i][0], wmax);
      hmax = Math.max(sizes[i][1], hmax);
    }

    return wmax * hmax;
  }
}