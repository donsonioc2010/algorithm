import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
  private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

  public static void main(String[] args) throws Exception {
    String s = br.readLine();
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i <= 25; i++) {
      sb.append(s.indexOf('a' + i) + " ");
    }
    System.out.println(sb);
  }
}
