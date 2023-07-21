import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
  private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

  public static void main(String[] args) throws Exception {
    Stack<Integer> stack = new Stack<>();
    int N = Integer.parseInt(br.readLine());
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < N; i++) {
      String[] a = br.readLine().split(" ");
      if ("push".equals(a[0]))  stack.push(Integer.parseInt(a[1]));
      if ("pop".equals(a[0]))   sb.append(stack.isEmpty() ? -1 : stack.pop()).append("\n");
      if ("size".equals(a[0]))  sb.append(stack.size()).append("\n");
      if ("empty".equals(a[0])) sb.append(stack.isEmpty() ? 1 : 0).append("\n");
      if ("top".equals(a[0]))   sb.append(stack.isEmpty() ? -1 : stack.peek()).append("\n");
    }
    System.out.println(sb);
  }
}
