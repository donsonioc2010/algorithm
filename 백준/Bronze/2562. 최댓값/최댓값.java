import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
  private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

  public static void main(String[] args) throws Exception {
    int max = Integer.MIN_VALUE;
    int idx = 0;
    for (int i = 1; i <= 9; i++) {
      int num = Integer.parseInt(br.readLine());
      if (num > max) {
        idx = i;
        max = num;
      }
    }
    System.out.println(max + "\n" + idx);
  }
}
