import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
  private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

  public static void main(String[] args) throws Exception {
    int N = Integer.parseInt(br.readLine());
    // 1,2,3,5, 8

    if (N <= 3) {
      System.out.println(N);
      return;
    }
    BigInteger[] ary = new BigInteger[N + 1];
    ary[1] = BigInteger.ONE;
    ary[2] = BigInteger.TWO;
    ary[3] = BigInteger.valueOf(3);
    for (int i = 4; i <= N; i++)
      ary[i] = ary[i - 1].add(ary[i - 2]);

    System.out.println(ary[N].mod(BigInteger.valueOf(10007)));
  }
}
