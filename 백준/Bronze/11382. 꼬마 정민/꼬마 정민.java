import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

  public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] strArr = br.readLine().split(" ");

    long A = Long.parseLong(strArr[0]),
        B = Long.parseLong(strArr[1]),
        C = Long.parseLong(strArr[2]);

    System.out.println((A + B + C));
  }

}
