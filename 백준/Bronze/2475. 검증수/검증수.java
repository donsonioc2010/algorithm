import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

  public static void main(String[] args) throws Exception {
    StringTokenizer st = new StringTokenizer(br.readLine());
    int N = 0;
    for (int i = 0; i < 5; i++)
      N += (int) Math.pow(Integer.parseInt(st.nextToken()), 2);
    System.out.println(N % 10);
  }
}
