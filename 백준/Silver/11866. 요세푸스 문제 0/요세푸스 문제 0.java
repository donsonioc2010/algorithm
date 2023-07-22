import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
  private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

  public static void main(String[] args) throws Exception {
    String[] num = br.readLine().split(" ");
    int N = Integer.parseInt(num[0]);
    int K = Integer.parseInt(num[1]);
    int idx = 0;
    int[] answer = new int[N];
    Queue<Integer> q = new LinkedList<>();
    for (int i = 1; i <= N; i++)
      q.offer(i);

    while (!q.isEmpty()) {
      for (int i = 1; i <= K; i++) {
        if (i == K)
          answer[idx++] = q.poll();
        else
          q.offer(q.poll());
      }
    }
    StringBuffer sb = new StringBuffer("<");
    for (int i = 0; i < N - 1; i++) {
      sb.append(answer[i] + ", ");
    }
    sb.append(answer[N - 1] + ">");
    System.out.println(sb);
  }
}
