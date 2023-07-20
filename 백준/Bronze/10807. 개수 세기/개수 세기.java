import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

  public static void main(String[] args) throws Exception {
    int N = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());
    int fNum = Integer.parseInt(br.readLine());
    int count = 0;
    for (int i = 0; i < N; i++)
      count = fNum == Integer.parseInt(st.nextToken()) ? count + 1 : count;
    System.out.println(count);
  }
}
