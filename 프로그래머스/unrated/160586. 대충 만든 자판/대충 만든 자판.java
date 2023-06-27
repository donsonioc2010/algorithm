import java.util.HashMap;
import java.util.Map;

class Solution {
  public int[] solution(String[] keymap, String[] targets) {
    Map<String, Integer> keypad = new HashMap<>();

    for (int i = 0; i < keymap.length; i++) {
      String[] tempKeyAry = keymap[i].split("");
      for (int j = 0; j < tempKeyAry.length; j++) {
        if (keypad.containsKey(tempKeyAry[j])) {
          keypad.put(tempKeyAry[j], Math.min(j + 1, keypad.get(tempKeyAry[j])));
        } else {
          keypad.put(tempKeyAry[j], j + 1);
        }
      }
    }
    int[] answer = new int[targets.length];
    for (int i = 0; i < targets.length; i++) {
      int tempNum = 0;
      String[] tempTargetSplit = targets[i].split("");
      for (String c : tempTargetSplit) {
        if (keypad.containsKey(c)) {
          tempNum += keypad.get(c);
        } else {
          tempNum = -1;
          break;
        }
      }
      answer[i] = tempNum;
    }

    return answer;
  }
}