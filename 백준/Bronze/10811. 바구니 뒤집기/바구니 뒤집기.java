import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class Main {
  private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

  public static void main(String[] args) throws Exception {
    StringTokenizer st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());
    int[] ary = IntStream.range(1, N + 1).map(Integer::valueOf).toArray();
    for (int i = 0; i < M; i++) {
      st = new StringTokenizer(br.readLine());
      int start = Integer.parseInt(st.nextToken());
      int end = Integer.parseInt(st.nextToken());
      int tempEnd = end - 1;
      int[] tempAry = Arrays.copyOf(ary, ary.length);

      for (int j = start - 1; j < end; j++) {
        tempAry[j] = ary[tempEnd--];
      }
      ary = tempAry;
    }
    for (int i = 0; i < N; i++)
      System.out.print(ary[i] + " ");
    System.out.println();
  }
}
