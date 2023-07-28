import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
  private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

  public static void main(String[] args) throws Exception {
    int N = Integer.parseInt(br.readLine());
    int[][] color = new int[N + 1][N + 1]; // R:0, G:1, B:2
    for (int i = 1; i <= N; i++) {
      String[] ary = br.readLine().split(" ");
      for (int j = 0; j < ary.length; j++) {
        color[i][j] = Integer.parseInt(ary[j]);
      }
    }
    int[][] dp = new int[N + 1][N + 1];
    dp[1][0] = color[1][0];
    dp[1][1] = color[1][1];
    dp[1][2] = color[1][2];
    for (int i = 2; i <= N; i++) {
      dp[i][0] = Math.min(dp[i - 1][1], dp[i - 1][2]) + color[i][0];
      dp[i][1] = Math.min(dp[i - 1][0], dp[i - 1][2]) + color[i][1];
      dp[i][2] = Math.min(dp[i - 1][0], dp[i - 1][1]) + color[i][2];
    }
    System.out.println(Math.min(dp[N][0], Math.min(dp[N][1], dp[N][2])));
  }
}
