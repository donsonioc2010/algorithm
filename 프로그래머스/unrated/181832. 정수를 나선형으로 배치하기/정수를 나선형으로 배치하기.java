import java.util.Arrays;
/**
 * 1회차 왼쪽으로, 2회차 아래로, 3회차 오른쪽으로, 4회차 위로, 5회차 왼쪽으로
 * 1%4 = 1, 2%4 = 2, 3%4 = 3, 4%4 = 0, 5%4 = 1
 */
class Solution {

  private int runCnt = 1;
  private int[][] answer;
  private int x = 0, y = 0;

  public int[][] solution(int n) {
    answer = new int[n][n];
    int val = 1;
    int maxVal = n * n;

    while (val <= maxVal) {

      if (runCnt % 4 == 1) { // 왼쪽으로
        answer[x][y] = val++;
        if (isAbleAddIndex(n, y + 1, "y")) {
          y++;
        } else {
          x++;
          runCnt++;
        }
        continue;
      } else if (runCnt % 4 == 2) { // 아래로
        answer[x][y] = val++;
        if (isAbleAddIndex(n, x + 1, "x")) {
          x++;
        } else {
          y--;
          runCnt++;
        }
        continue;
      } else if (runCnt % 4 == 3) { // 오른쪽으로
        answer[x][y] = val++;
        if (isAbleAddIndex(n, y - 1, "y")) {
          y--;
        } else {
          x--;
          runCnt++;
        }
        continue;
      } else if (runCnt % 4 == 0) { // 위로
        answer[x][y] = val++;
        if (isAbleAddIndex(n, x - 1, "x")) {
          x--;
        } else {
          y++;
          runCnt++;
        }
        continue;
      }
    }
    return answer;
  }

  private boolean isAbleAddIndex(int n, int num, String op) {
    if (num == n || num < 0) {
      return false;
    }
    if ("x".equals(op)) {
      return answer[num][y] == 0 ? true : false;
    }
    return answer[x][num] == 0 ? true : false;
  }
}