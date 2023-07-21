import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
  private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

  private static int N, X;

  public static void main(String[] args) throws Exception {
    StringTokenizer st = new StringTokenizer(br.readLine());
    N = Integer.parseInt(st.nextToken());
    X = Integer.parseInt(st.nextToken());

    st = new StringTokenizer(br.readLine());
    StringBuilder sb = new StringBuilder();
    while (st.hasMoreTokens()) {
      int temp = Integer.parseInt(st.nextToken());
      if (temp < X)
        sb.append(temp + " ");
    }
    System.out.println(sb);
  }
}
