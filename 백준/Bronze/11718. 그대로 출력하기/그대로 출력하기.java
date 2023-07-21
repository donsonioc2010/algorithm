import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
  private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

  public static void main(String[] args) throws Exception {
    String s = null;
    StringBuilder sb = new StringBuilder();
    while ((s = br.readLine())!=null) {
      sb.append(s + "\n");
    }
    System.out.println(sb);
  }
}
