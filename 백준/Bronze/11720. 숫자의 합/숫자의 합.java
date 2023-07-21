import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

  public static void main(String[] args) throws Exception {
    br.readLine();
    String[] a = br.readLine().split("");
    Integer n = 0;
    for(String s : a)
      n += Integer.parseInt(s);
    System.out.println(n);
  }
}
