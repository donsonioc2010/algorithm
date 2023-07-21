import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
  private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

  public static void main(String[] args) throws Exception {
    String[] num = br.readLine().split(" ");
    int N = Integer.parseInt(num[0]);
    int K = Integer.parseInt(num[1]);
    System.out.println(fac(N) / (fac(K) * fac(N - K)));
  }

  private static int fac(int n) {
    if (n == 1 || n == 0)
      return 1;
    return fac(n - 1) * n;
  }
}
