import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
  private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

  private static int[] dx = { 1, -1, 0, 0 };
  private static int[] dy = { 0, 0, 1, -1 };

  private static List<Integer> areas = new ArrayList<>();
  private static int[][] map;

  private static int area;
  private static int N, M;

  public static void main(String[] args) throws Exception {
    String[] NM = br.readLine().split(" ");
    N = Integer.parseInt(NM[0]);
    M = Integer.parseInt(NM[1]);
    map = new int[N][M];

    for (int i = 0; i < N; i++) {
      map[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    }

    for (int i = 0; i < N; i++) {
      for (int j = 0; j < M; j++) {
        if (map[i][j] == 0) {
          map[i][j] = -1;
        } else if (map[i][j] == 1) {
          area = 0;
          dfs(i, j);
          areas.add(area);
        }
      }
    }

    System.out.println(areas.size() + "\n" +
        (areas.size() == 0 ? String.valueOf(0) : areas.stream().max(Comparator.naturalOrder()).get()));
  }

  private static void dfs(int x, int y) {
    area++;
    map[x][y] = -1;
    for (int i = 0; i < 4; i++) {
      int tx = x + dx[i];
      int ty = y + dy[i];

      if (tx < 0 || ty < 0 || tx >= N || ty >= M)
        continue;
      if (map[tx][ty] == -1)
        continue;
      if (map[tx][ty] == 0) {
        map[tx][ty] = -1;
        continue;
      }
      dfs(tx, ty);
    }
  }
}
