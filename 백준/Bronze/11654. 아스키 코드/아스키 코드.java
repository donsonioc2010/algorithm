import java.io.BufferedReader;
import java.io.InputStreamReader;
/**
 * 문자열 - 아스키코드
 */
public class Main {
  public static void main(String[] args) throws Exception {
    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
      int num = br.readLine().charAt(0);
      System.out.println(num);
    }
  }
}
