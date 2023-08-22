import java.util.Arrays;
import java.util.Stack;

class Solution {
  public static void main(String[] args) {
    System.out.println(Arrays.toString(new Solution().solution(new int[] { 2, 3, 3, 5 })));
    System.out.println(Arrays.toString(new Solution().solution(new int[] { 9, 1, 5, 3, 6, 2 })));
  }

  public int[] solution(int[] numbers) {
    Stack<int[]> st = new Stack<>();
    int[] answer = new int[numbers.length];
    for (int i = 0; i < numbers.length; i++) {
      while (!st.isEmpty() && st.peek()[1] < numbers[i]) {
        answer[st.pop()[0]] = numbers[i];
      }
      st.push(new int[] { i, numbers[i] });
    }

    while (!st.isEmpty()) {
      answer[st.pop()[0]] = -1;
    }
    return answer;
  }
}