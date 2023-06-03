
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
public class Main {

  // N == 1이상 50만이하
  public static void main(String[] args) throws Exception {
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int N = Integer.parseInt(br.readLine());

    Queue<Integer> q = new ArrayDeque<>();

    // N부터 1까지 Stack Push
    for (int i = 1; i <= N; i++) {
      q.add(i);
    }

    while (q.size() > 1) {
      q.poll();
      q.add(q.poll());
    }
    System.out.println(q.poll());
  }
}
