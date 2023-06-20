import java.util.Arrays;

class Solution {
  public int solution(int[] d, int budget) {
    Arrays.sort(d);
    int cnt = 0;
    int sum = 0;
    for (int i = 0; i < d.length; i++) {
      sum += d[i];
      if (sum <= budget) {
        cnt++;
      } else {
        break;
      }
    }
    return cnt;
  }
}