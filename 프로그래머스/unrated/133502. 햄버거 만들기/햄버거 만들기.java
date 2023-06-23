import java.util.Stack;

class Solution {
  public static void main(String[] args) {
    System.out.println(
        new Solution().solution(new int[] { 1, 1, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1 }));
    ;
  }

  // 1. 빵, 2. 야채, 3. 고기 => 1231
  int[] perfect = { 1, 3, 2, 1 };

  int cnt = 0;

  public int solution(int[] ingredient) {
    Stack<Integer> stack = new Stack<>();
    for (int num : ingredient) {
      stack.push(num);
      if (stack.size() >= 4 && stack.peek() == 1) {
        boolean isBurger = true;
        Stack<Integer> temp = new Stack<>();
        for (int i = 0; !stack.isEmpty() && i < perfect.length; i++) {
          int tempNum = stack.pop();
          temp.push(tempNum);
          if (tempNum != perfect[i]) {
            isBurger = false;
            break;
          }
        }
        if (isBurger) {
          cnt++;
        } else {
          while (!temp.isEmpty()) {
            stack.push(temp.pop());
          }
        }
      }
    }

    return cnt;
  }
}