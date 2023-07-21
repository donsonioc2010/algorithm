import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

  private static String a = "ascending", d = "descending", m = "mixed";

  public static void main(String[] args) throws Exception {

    StringTokenizer st = new StringTokenizer(br.readLine());
    int lastNum = Integer.parseInt(st.nextToken());
    boolean isStOne = lastNum == 1;
    if (!(lastNum == 1 || lastNum == 8)) {
      System.out.println(m);
      return;
    }

    for (int i = 0; i < 7; i++) {
      int t = Integer.parseInt(st.nextToken());
      if (isStOne && t != lastNum + 1) {
        System.out.println(m);
        return;
      } else if (!isStOne && t != lastNum - 1) {
        System.out.println(m);
        return;
      }
      lastNum = t;
    }
    System.out.println(isStOne ? a : d);
  }
}
