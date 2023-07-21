import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

  public static void main(String[] args) throws Exception {
    StringTokenizer st;
    int x = 0, y = 0, max = Integer.MIN_VALUE;

    for (int i = 1; i <= 9; i++) {
      st = new StringTokenizer(br.readLine());
      for (int j = 1; j <= 9; j++) {
        int temp = Integer.parseInt(st.nextToken());
        if (temp > max) {
          x = i;
          y = j;
          max = temp;
        }
      }
    }
    System.out.printf("%d\n%d %d", max, x, y);
  }
}
