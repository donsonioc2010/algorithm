import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
  private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

  public static void main(String[] args) throws Exception {
    while (true) {
      String s = br.readLine();
      if ("0".equals(s))
        break;
      String r = "yes";
      for (int i = 0; i < s.length() / 2; i++) {
        if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
          r = "no";
          break;
        }
      }
      System.out.println(r);
    }
  }
}
