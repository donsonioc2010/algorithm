import java.util.HashMap;
import java.util.Map;

class Solution {
  Map<String, int[]> map = new HashMap<>() {
    {
      put("1", new int[] { 1, 1 });
      put("2", new int[] { 1, 2 });
      put("3", new int[] { 1, 3 });
      put("4", new int[] { 2, 1 });
      put("5", new int[] { 2, 2 });
      put("6", new int[] { 2, 3 });
      put("7", new int[] { 3, 1 });
      put("8", new int[] { 3, 2 });
      put("9", new int[] { 3, 3 });
      put("*", new int[] { 4, 1 });
      put("0", new int[] { 4, 2 });
      put("#", new int[] { 4, 3 });
    }
  };

  public String solution(int[] numbers, String hand) {
    int[] leftCur = map.get("*");
    int[] rightCur = map.get("#");
    StringBuilder sb = new StringBuilder();
    for (int num : numbers) {
      if (num == 1 || num == 4 || num == 7) {
        sb.append("L");
        leftCur = map.get(String.valueOf(num));
      } else if (num == 3 || num == 6 || num == 9) {
        sb.append("R");
        rightCur = map.get(String.valueOf(num));
      } else {

        int[] numCur = map.get(String.valueOf(num));
        int leftDis = (int) Math.abs(numCur[0] - leftCur[0]) + (int) Math.abs(numCur[1] - leftCur[1]);
        int rightDis = (int) Math.abs(numCur[0] - rightCur[0]) + (int) Math.abs(numCur[1] - rightCur[1]);

        if (leftDis == rightDis) {
          if (hand.equals("right")) {
            sb.append("R");
            rightCur = numCur;
          } else {
            sb.append("L");
            leftCur = numCur;
          }
        } else if (leftDis < rightDis) {
          sb.append("L");
          leftCur = numCur;
        } else {
          sb.append("R");
          rightCur = numCur;
        }
      }
    }
    return sb.toString();
  }
}