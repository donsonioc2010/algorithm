import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
  private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

  public static void main(String[] args) throws Exception {
    StringBuffer sb = new StringBuffer();
    while (true) {
      String orgS = br.readLine();
      if (orgS.equals("."))
        break;

      String[] s = orgS.split("");
      Stack<String> st = new Stack<>();
      boolean isRight = true;
      for (String c : s) {
        if ("[".equals(c) || "(".equals(c)) {
          st.push(c);
        }
        if ("]".equals(c) && (st.isEmpty() || !"[".equals(st.pop()))) {
          isRight = false;
          break;
        }
        if (")".equals(c) && (st.isEmpty() || !"(".equals(st.pop()))) {
          isRight = false;
          break;
        }
      }
      sb.append(isRight && st.isEmpty() ? "yes" : "no")
          .append("\n");
    }
    System.out.println(sb);
  }
}
