import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

  public static void main(String[] args) throws Exception {
    int T = Integer.parseInt(br.readLine());
    StringTokenizer st;
    StringBuffer sb = new StringBuffer();
    for (int i = 0; i < T; i++) {
      st = new StringTokenizer(br.readLine());
      int H = Integer.parseInt(st.nextToken());
      int W = Integer.parseInt(st.nextToken());
      int C = Integer.parseInt(st.nextToken());

      int y = C % H;
      int x = C / H + 1;
      if (y == 0) {
        x = C / H;
        y = H;
      }
      sb.append(y * 100 + x).append("\n");
    }
    System.out.println(sb);
  }
}
