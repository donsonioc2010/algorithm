import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class Main {
  private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

  public static void main(String[] args) throws Exception {
    int N = Integer.parseInt(br.readLine());

    StringBuffer sb = new StringBuffer();
    Deque<Integer> q = new LinkedList<>();
    for (int i = 0; i < N; i++) {
      String[] s = br.readLine().split(" ");
      if ("push".equals(s[0]))
        q.offer(Integer.parseInt(s[1]));
      if ("pop".equals(s[0]))
        sb.append(q.isEmpty() ? -1 : q.poll());
      if ("size".equals(s[0]))
        sb.append(q.size());
      if ("empty".equals(s[0]))
        sb.append(q.isEmpty() ? 1 : 0);
      if ("front".equals(s[0]))
        sb.append(q.isEmpty() ? -1 : q.peekFirst());
      if ("back".equals(s[0]))
        sb.append(q.isEmpty() ? -1 : q.peekLast());
      if (!"push".equals(s[0]))
        sb.append("\n");
    }
    System.out.println(sb);
  }
}
