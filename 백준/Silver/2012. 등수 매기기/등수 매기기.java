import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
  private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

  public static void main(String[] args) throws Exception {
    int N = Integer.parseInt(br.readLine());
    PriorityQueue<Integer> list = new PriorityQueue<>();

    for (int i = 0; i < N; i++)
      list.add(Integer.parseInt(br.readLine()));

    long sum = 0;
    for (int i = 1; i <= N; i++)
      sum += (long) Math.abs(i - list.poll());
    System.out.println(sum);
  }
}
