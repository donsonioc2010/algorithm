import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
  private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

  private static int zero = 0, one = 0;

  public static void main(String[] args) throws Exception {
    int N = Integer.parseInt(br.readLine());
    Stack<Integer> st = new Stack<>();
    for (int i = 0; i < N; i++) {
      int num = Integer.parseInt(br.readLine());
      if (num == 0 && !st.empty()) {
        st.pop();
      } else {
        st.push(num);
      }
    }
    int sum = 0;
    while (!st.empty())
      sum += st.pop();
    System.out.println(sum);
  }
}
