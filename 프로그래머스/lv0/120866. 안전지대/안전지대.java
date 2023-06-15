import java.util.Arrays;

class Solution {
  // board == [1][1] ~ [100][100]

  // 왼쪽위, 위, 오른쪽 위, 왼쪽, 오른쪽, 왼쪽 아래, 아래, 오른쪽 아래
  private static int[] x = { -1, 0, 1, -1, 0,1, -1, 0, 1 };
  private static int[] y = { -1, -1, -1, 0, 0,0, 1, 1, 1 };
  private static int[][] newBoard;

  public int solution(int[][] board) {
    newBoard = board;
    int answer = remake();
    for (int i = 0; i < newBoard.length; i++) {
      System.out.println(Arrays.toString(newBoard[i]));
    }

    return answer;
  }

  private int remake() {
    int cnt = 0;
    // y
    for (int i = 0; i < newBoard.length; i++) {
      // x
      for (int j = 0; j < newBoard[i].length; j++) {
        boolean isSafe = true;
        for (int k = 0; k < x.length; k++) {
          int dy = i + y[k];
          int dx = j + x[k];
          if (dx < 0 || dx >= newBoard[i].length || dy < 0 || dy >= newBoard.length) {
            continue;
          }
          if (newBoard[dy][dx] == 1) {
            isSafe = false;
            break;
          }
        }
        if (isSafe) {
          cnt++;
        }
      }
    }
    return cnt;
  }
}