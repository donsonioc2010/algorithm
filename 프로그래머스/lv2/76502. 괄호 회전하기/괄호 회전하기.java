import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

class Solution {
  private Set<String> open = new HashSet<>() {
    {
      add("(");
      add("[");
      add("{");
    }
  };

  public int solution(String s) {
    int cnt = 0;

    for (int i = 0; i < s.length(); i++) {
      Stack<String> stack = new Stack<>();
      boolean isRight = true;

      String[] ary = s.split("");
      for (String c : ary) {
        if (open.contains(c)) {
          stack.push(c);
          continue;
        }
        String close = stack.isEmpty() ? "}}}}}}}}" : stack.pop(); // 일부로 존재하지 않는 닫힘마크
        if (!(("]".equals(c) && "[".equals(close)) ||
            (")".equals(c) && "(".equals(close)) ||
            ("}".equals(c) && "{".equals(close)))) {
          isRight = false;
          break;
        }
      }
      if (stack.isEmpty() && isRight)
        cnt++;

      s = s.substring(1) + s.substring(0, 1);
    }

    return cnt;
  }
}