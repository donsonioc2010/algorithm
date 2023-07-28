import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
  private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

  public static void main(String[] args) throws Exception {
    int N = Integer.parseInt(br.readLine());
    if (N <= 1) {
      System.out.println(N);
      return;
    }
    BigInteger[] ary = new BigInteger[N + 1];
    ary[0] = BigInteger.ZERO;
    ary[1] = BigInteger.ONE;
    for (int i = 2; i <= N; i++) {
      ary[i] = ary[i - 1].add(ary[i - 2]);
    }
    System.out.println(ary[N]);
  }
}
