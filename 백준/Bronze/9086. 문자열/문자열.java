import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
  private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

  public static void main(String[] args) throws Exception {
    int t = Integer.parseInt(br.readLine());
    StringBuffer sb = new StringBuffer();
    for (int i = 0; i < t; i++) {
      String s = br.readLine();
      if (s.length() == 1)
        sb.append(s + s + "\n");
      else
        sb.append(String.valueOf(s.charAt(0)) + String.valueOf(s.charAt(s.length() - 1)) + "\n");
    }
    System.out.println(sb);

  }
}
