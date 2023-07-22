import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
  private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

  public static void main(String[] args) throws Exception {
    int L = Integer.parseInt(br.readLine());
    String S = br.readLine();
    BigInteger sum = new BigInteger("0");
    for (int i = 0; i < L; i++) {
      sum = sum.add(new BigInteger("31").pow(i).multiply(new BigInteger(String.valueOf(S.charAt(i) - ('a' - 1)))));
    }
    System.out.println(sum.toString());
  }
}
