import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
  private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

  public static void main(String[] args) throws Exception {
    int N = Integer.parseInt(br.readLine());
    Stack<String> st;
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < N; i++) {
      st = new Stack<>();
      String[] sary = br.readLine().split("");
      String r = "YES";
      for (String s : sary) {
        if ("(".equals(s)) {
          st.push(s);
        } else {
          if (st.isEmpty()) {
            r = "NO";
            break;
          } else {
            st.pop();
          }
        }
      }
      if (!st.isEmpty())
        r = "NO";
      sb.append(r + "\n");
    }
    System.out.println(sb);
  }
}
