import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
  private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

  public static void main(String[] args) throws Exception {
    StringTokenizer st = new StringTokenizer(br.readLine());
    int[] d = new int[3];
    for (int i = 0; i < 3; i++)
      d[i] = Integer.parseInt(st.nextToken());
    if (d[0] == d[1] && d[1] == d[2]) {
      System.out.println(d[0] * 1000 + 10000);
      return;
    }

    if (d[0] != d[1] && d[1] != d[2] && d[2] != d[0]) {
      int max = Integer.MIN_VALUE;
      for (int i = 0; i < 3; i++) {
        max = Math.max(max, d[i]);
      }
      System.out.println(100 * max);
      return;
    }
    int num = 0;
    if (d[0] == d[1] || d[2] == d[0])
      num = d[0];
    if (d[1] == d[2])
      num = d[1];
    System.out.println(num * 100 + 1000);
  }
}
