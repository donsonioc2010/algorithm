import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
  private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

  public static void main(String[] args) throws Exception {
    int T = Integer.parseInt(br.readLine());
    StringBuffer sb = new StringBuffer();
    StringTokenizer st;
    for (int i = 0; i < T; i++) {
      Queue<Integer[]> q = new LinkedList<>();

      st = new StringTokenizer(br.readLine());
      int N = Integer.parseInt(st.nextToken());
      int target = Integer.parseInt(st.nextToken());

      st = new StringTokenizer(br.readLine());
      PriorityQueue<Integer> qq = new PriorityQueue<>(Comparator.reverseOrder());
      for (int j = 0; j < N; j++) {
        int num = Integer.parseInt(st.nextToken());
        qq.offer(num);
        q.offer(new Integer[] { j, num });
      }
      int cnt = 0;
      while (!q.isEmpty()) {
        if (qq.peek() == q.peek()[1]) {
          cnt++;

          if (target == q.peek()[0]) {
            sb.append(cnt + "\n");
            break;
          }
          qq.poll();
          q.poll();
        } else {
          q.offer(q.poll());
        }
      }
    }
    System.out.println(sb);
  }
}
