import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class Main {
  private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

  public static void main(String[] args) throws Exception {
    long N = Long.parseLong(br.readLine());
    for (int i = 0; i < 2; i++)
      N *= Long.parseLong(br.readLine());

    StringBuilder sb = new StringBuilder();
    String s = String.valueOf(N);
    for (int i = 0; i <= 9; i++) {
      String rs = s.replaceAll(String.valueOf(i), "");
      sb.append(s.length() - rs.length()).append("\n");
      s = rs;
    }
    System.out.println(sb);
  }
}
