import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) {
    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
      String[] NB = br.readLine().split(" ");
      String N = NB[0];
      int B = Integer.parseInt(NB[1]);
      int cnt = 0;
      int sum = 0;
      for (int i = N.length() - 1; i >= 0; i--) {
        char c = N.charAt(i);
        int num = 0;
        if (c >= 'A' && c <= 'Z')
          num = 10 + (c - 'A');
        else
          num = c - 48;

        sum += num * Math.pow(B, cnt);
        cnt++;
      }

      System.out.println(sum);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
