import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
  private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

  public static void main(String[] args) throws Exception {
    StringTokenizer st = new StringTokenizer(br.readLine());
    int h = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());

    if (m < 45) {
      m = 60 - 45 + m;
      h--;
    } else {
      m = m - 45;
    }
    if (h < 0) {
      h = 24 + h;
    }
    System.out.println(h + " " + m);
  }
}
