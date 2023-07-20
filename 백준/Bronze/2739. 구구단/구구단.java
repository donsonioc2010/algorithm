import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

public class Main {
  private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

  public static void main(String[] args) throws Exception {
    int N = Integer.parseInt(br.readLine());
    IntStream.range(1, 10).forEach(i -> System.out.printf("%d * %d = %d\n", N, i, N * i));
  }
}
