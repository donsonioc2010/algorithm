import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
  private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

  public static void main(String[] args) throws Exception {

    String str = IntStream.range(0, Integer.parseInt(br.readLine())).mapToObj(i -> {
      StringTokenizer st = null;
      try {
        st = new StringTokenizer(br.readLine());
      } catch (Exception e) {
      }
      return Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()) + "\n";
    }).collect(Collectors.joining());
    System.out.println(str);
  }
}
