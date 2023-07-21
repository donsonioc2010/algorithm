import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class Main {
  private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

  public static void main(String[] args) throws Exception {
    Deque<Integer> q = new LinkedList<>();
    int N = Integer.parseInt(br.readLine());
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < N; i++) {
      String[] a = br.readLine().split(" ");
      if ("push".equals(a[0]))
        q.offer(Integer.parseInt(a[1]));
      if ("pop".equals(a[0]))
        sb.append(q.isEmpty() ? -1 : q.poll()).append("\n");
      if ("size".equals(a[0]))
        sb.append(q.size()).append("\n");
      if ("empty".equals(a[0]))
        sb.append(q.isEmpty() ? 1 : 0).append("\n");
      if ("front".equals(a[0]))
        sb.append(q.isEmpty() ? -1 : q.peekFirst()).append("\n");
      if ("back".equals(a[0]))
        sb.append(q.isEmpty() ? -1 : q.peekLast()).append("\n");
    }
    System.out.println(sb);
  }
}
