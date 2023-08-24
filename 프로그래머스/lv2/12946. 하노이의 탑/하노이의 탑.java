import java.util.ArrayList;
import java.util.List;

class Solution {
  private List<int[]> list = new ArrayList<>();

  public int[][] solution(int n) {
    doHanoi(n, 1, 3, 2);
    return list.toArray(int[][]::new);
  }

  private void doHanoi(int n, int st, int to, int via) {
    if (n == 1) {
      moveWonPan(n, st, to);
    } else {
      doHanoi(n - 1, st, via, to);
      moveWonPan(n, st, to);
      doHanoi(n - 1, via, to, st);
    }
  }

  private void moveWonPan(int n, int st, int to) {
    list.add(new int[] { st, to });
  }
}