import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution {
  private int[][] map;
  private List<Integer> sizeList = new ArrayList<>();

  private int[] dx = { 1, -1, 0, 0 };
  private int[] dy = { 0, 0, 1, -1 };

  public int[] solution(String[] maps) {
    int N = maps.length;
    int M = maps[0].length();
    map = new int[N][M];
    for (int i = 0; i < N; i++) {
      String[] tempMap = maps[i].split("");
      for (int j = 0; j < M; j++) {
        map[i][j] = tempMap[j].equals("X") ? 0 : Integer.valueOf(tempMap[j]);
      }
    }

    for (int i = 0; i < N; i++) {
      for (int j = 0; j < M; j++) {
        if (map[i][j] != 0) {
          Queue<Integer[]> q = new LinkedList<>();
          q.offer(new Integer[] { i, j });
          int count = map[i][j];
          map[i][j] = 0;
          while (!q.isEmpty()) {
            Integer[] cur = q.poll();
            for (int k = 0; k < 4; k++) {
              int tx = cur[0] + dx[k];
              int ty = cur[1] + dy[k];
              if (tx < 0 || ty < 0 || tx >= N || ty >= M)
                continue;
              if (map[tx][ty] == 0)
                continue;
              count += map[tx][ty];
              map[tx][ty] = 0;
              q.offer(new Integer[] { tx, ty });
            }
          }
          sizeList.add(count);
        }
      }
    }
    return sizeList.size() == 0 ? new int[] { -1 }
        : sizeList.stream()
            .sorted((n1, n2) -> n1 - n2)
            .mapToInt(Integer::valueOf).toArray();
  }

}