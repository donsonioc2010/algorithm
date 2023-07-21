import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
  private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

  public static void main(String[] args) throws Exception {
    String s = br.readLine();
    int i = Integer.parseInt(br.readLine());
    System.out.println(s.charAt(i - 1));
  }
}
