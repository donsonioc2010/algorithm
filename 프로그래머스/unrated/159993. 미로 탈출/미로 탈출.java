import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
  int[] dx = { -1, 1, 0, 0 };
  int[] dy = { 0, 0, -1, 1 };

  String[][] map;
  int[][][] visited; // 0번 : 레버까지의 거리, 1번 레버에서 출구까지
  Integer[] S, L, E;

  int N = 0, M = 0;

  public int solution(String[] maps) {
    N = maps.length;
    M = maps[0].length();

    map = new String[N][M];
    visited = new int[2][N][M];
    for (int i = 0; i < 2; i++)
      for (int j = 0; j < maps.length; j++)
        Arrays.fill(visited[i][j], -1);

    for (int i = 0; i < maps.length; i++) {
      int isHaveS = maps[i].indexOf("S");
      int isHaveL = maps[i].indexOf("L");
      int isHaveE = maps[i].indexOf("E");

      if (isHaveS != -1)
        S = new Integer[] { i, isHaveS };
      if (isHaveL != -1)
        L = new Integer[] { i, isHaveL };
      if (isHaveE != -1)
        E = new Integer[] { i, isHaveE };
      map[i] = maps[i].split("");
    }

    bfs(0, S);
    bfs(1, L);

    int bL = visited[0][L[0]][L[1]];
    int bE = visited[1][E[0]][E[1]];

    return bL == -1 || bE == -1 ? -1 : bL + bE;
  }

  // visitedIdx = 0, 1
  void bfs(int visitedIdx, Integer[] startCur) {
    Queue<Integer[]> q = new LinkedList<>();
    q.add(startCur);
    visited[visitedIdx][startCur[0]][startCur[1]] = 0;
    while (!q.isEmpty()) {
      Integer[] cur = q.poll();
      for (int i = 0; i < 4; i++) {
        int tx = cur[0] + dx[i];
        int ty = cur[1] + dy[i];

        if (tx < 0 || ty < 0 || tx >= N || ty >= M)
          continue;
        if (map[tx][ty].equals("X") || visited[visitedIdx][tx][ty] != -1)
          continue;
        q.add(new Integer[] { tx, ty });
        visited[visitedIdx][tx][ty] = visited[visitedIdx][cur[0]][cur[1]] + 1;
      }
    }
  }
}