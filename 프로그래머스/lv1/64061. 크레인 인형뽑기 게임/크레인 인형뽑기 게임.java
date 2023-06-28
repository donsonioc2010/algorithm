import java.util.Stack;

class Solution {
  public int solution(int[][] board, int[] moves) {
    Stack<Integer> stack = new Stack<>();

    int answer = 0;
    for (int i = 0; i < moves.length; i++) {
      int num = 0;
      for (int j = 0; j < board.length; j++) {
        if (board[j][moves[i] - 1] != 0) {
          num = board[j][moves[i] - 1];
          board[j][moves[i] - 1] = 0;
          break;
        }
      }
      if (num != 0) {
        if (stack.isEmpty()) {
          stack.push(num);
        } else {
          if (stack.peek() == num) {
            answer+=2;
            stack.pop();
          } else {
            stack.push(num);
          }
        }
          
      }
    }

    return answer;
  }
}