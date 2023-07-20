import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
  private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

  public static void main(String[] args) throws Exception {
    int N = Integer.parseInt(br.readLine());
    for (int i = 1; i <= N; i++) {
      for (int j = 1; j <= N - i; j++)
        System.out.print(" ");
      for (int j = 1; j <= i; j++)
        System.out.print("*");
      System.out.println();
    }
  }
}
