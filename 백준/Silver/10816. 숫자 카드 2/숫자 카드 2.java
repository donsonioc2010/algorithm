import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
  private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

  public static void main(String[] args) throws Exception {
    Map<Integer, Integer> m = new HashMap<>();
    int N = Integer.parseInt(br.readLine());

    StringTokenizer st = new StringTokenizer(br.readLine());
    for (int i = 0; i < N; i++) {
      int t = Integer.parseInt(st.nextToken());
      if (m.containsKey(t))
        m.put(t, m.get(t) + 1);
      else
        m.put(t, 1);
    }

    int M = Integer.parseInt(br.readLine());
    StringBuilder sb = new StringBuilder();
    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < M; i++) {
      int t = Integer.parseInt(st.nextToken());
      sb.append(m.containsKey(t) ? m.get(t) : 0)
          .append(" ");
    }
    System.out.println(sb);
  }
}
