import java.util.Arrays;
import java.util.Stack;

class Solution {
  public static void main(String[] args) {
    System.out.println(Arrays.toString(new Solution().solution(new int[] { 1, 2, 3, 2, 3 })));
  }

  public int[] solution(int[] prices) {

    int[] answer = new int[prices.length];
    Stack<int[]> st = new Stack<>();
    for (int i = 1; i <= prices.length; i++) {
      if (st.isEmpty()) {
        st.push(new int[] { i, prices[i - 1] });
        continue;
      }

      while (!st.empty() && st.peek()[1] > prices[i - 1]) {
        int[] temp = st.pop();
        answer[temp[0] - 1] = i - temp[0];
      }
      st.push(new int[] { i, prices[i - 1] });
    }
    while (!st.empty()) {
      int[] temp = st.pop();
      answer[temp[0] - 1] = prices.length - temp[0];
    }
    return answer;
  }
}