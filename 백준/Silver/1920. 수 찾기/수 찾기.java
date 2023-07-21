import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {
  private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

  private static Set<Integer> set = new TreeSet<>();

  public static void main(String[] args) throws Exception {
    int N = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());
    for (int i = 0; i < N; i++)
      set.add(Integer.parseInt(st.nextToken()));

    int M = Integer.parseInt(br.readLine());
    st = new StringTokenizer(br.readLine());
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < M; i++) {
      sb.append(set.contains(Integer.parseInt(st.nextToken())) ? 1 : 0)
          .append("\n");
    }
    System.out.println(sb);
  }
}
