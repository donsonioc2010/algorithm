import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

  private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  private static long mod = 1000000000L;

  public static void main(String[] args) throws Exception {
    int N = Integer.parseInt(br.readLine());
    long[][] dp = new long[N + 1][10];

    // 초기값, 첫번째 방이 자리수, 두번째 방이 해당 숫자로 끝나는 갯수
    for (int i = 1; i <= 9; i++)
      dp[1][i] = 1;

    for (int i = 2; i <= N; i++) { // 자릿수까지
      for (int j = 0; j <= 9; j++) {
        if (j == 0) // 더할게 1뿐
          dp[i][j] = dp[i - 1][j + 1] % mod;
        else if (j == 9)
          dp[i][j] = dp[i - 1][j - 1] % mod;
        else
          dp[i][j] = (dp[i - 1][j - 1] + dp[i - 1][j + 1]) % mod;
      }
    }
    long sum = 0;
    for (int i = 0; i <= 9; i++)
      sum += dp[N][i];
    System.out.println(sum%mod);
  }
}
