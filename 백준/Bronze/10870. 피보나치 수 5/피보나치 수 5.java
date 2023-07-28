import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
  private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

  public static void main(String[] args) throws Exception {
    int N = Integer.parseInt(br.readLine());
    if (N <= 1) {
      System.out.println(N);
      return;
    }
    int[] ary = new int[N + 1];
    ary[0] = 0;
    ary[1] = 1;
    for (int i = 2; i <= N; i++) {
      ary[i] = ary[i - 1] + ary[i - 2];
    }
    System.out.println(ary[N]);
  }
}
