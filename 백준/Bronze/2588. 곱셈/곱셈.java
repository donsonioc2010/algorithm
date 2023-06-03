
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 제공 숫자 1, 2 번 2번자리수만큼 loop, 1,2번 자연수는 모두 세자리
 */
public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int num1 = Integer.parseInt(br.readLine());

    String strNum2 = br.readLine();
    int total = 0;

    int multiNum = 1;

    StringBuilder sb = new StringBuilder();
    for (int i = strNum2.length() - 1; i > -1; i--) {
      int tempNum = num1 * Integer.parseInt(strNum2.charAt(i) + "");
      sb.append(tempNum + "\n");
      total += tempNum * multiNum;
      multiNum *= 10;
    }
    sb.append(total);
    System.out.println(sb.toString());
  }
}
