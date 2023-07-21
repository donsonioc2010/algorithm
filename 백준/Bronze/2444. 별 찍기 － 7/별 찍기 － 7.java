import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
  private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

  public static void main(String[] args) throws Exception {
    int line = Integer.parseInt(br.readLine()) * 2 - 1;
    boolean isMinus = true;
    int star = 1, space = line/2;
    for (int i = 1; i <= line; i++) {
      System.out.print(" ".repeat(space));
      System.out.print("*".repeat(star));
      System.out.println();

      isMinus = i >= (line / 2) + 1 ? false : true;
      space = isMinus ? space - 1 : space + 1;
      star = isMinus ? star + 2 : star - 2;
    }
  }
}
