import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
  private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

  public static void main(String[] args) throws Exception {
    int line = Integer.parseInt(br.readLine()) * 2 - 1;
    boolean isMinus = true;
    int star = 1, space = line/2;
    for (int i = 1; i <= line; i++) {
      for (int j = 1; j <= space; j++)
        System.out.print(" ");
      for (int j = 1; j <= star; j++)
        System.out.print("*");
      System.out.println();
      if (i == (line / 2) + 1)
        isMinus = false;
      if (isMinus) {
        space--;
        star += 2;
      } else {
        space++;
        star -= 2;
      }
    }
  }
}
