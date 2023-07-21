import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

  public static void main(String[] args) throws Exception {
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n1 = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
    int n2 = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
    System.out.println(n1 > n2 ? n1 : n2);
  }
}
