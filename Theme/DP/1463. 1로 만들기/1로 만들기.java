import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

//1더하기, 3곱하기, 2곱하기
public class Main {
  private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

  public static void main(String[] args) throws Exception {
    int N = Integer.parseInt(br.readLine());
    int[] ary = new int[N + 1];
    Arrays.fill(ary, -1);
    ary[1] = 0;
    for (int i = 1; i <= N; i++) {
      if (i * 3 <= N)
        ary[i * 3] = ary[i * 3] != -1 ? Math.min(ary[i] + 1, ary[i * 3]) : ary[i] + 1;
      if (i * 2 <= N)
        ary[i * 2] = ary[i * 2] != -1 ? Math.min(ary[i] + 1, ary[i * 2]) : ary[i] + 1;
      if (i + 1 <= N)
        ary[i + 1] = ary[i + 1] != -1 ? Math.min(ary[i] + 1, ary[i + 1]) : ary[i] + 1;

    }
    System.out.println(ary[N]);
  }
}
