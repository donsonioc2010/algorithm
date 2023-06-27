import java.util.Set;
import java.util.TreeSet;

class Solution {

  public int[] solution(int[] lottos, int[] win_nums) {
    int rankDefault = 6;
    int zeroSize = 0;
    int rightNumSize = 0;
    Set<Integer> winSet = new TreeSet<>();
    for (int i = 0; i < win_nums.length; i++) {
      winSet.add(win_nums[i]);
    }
    for (int i = 0; i < lottos.length; i++) {
      if (lottos[i] == 0) {
        zeroSize++;
        continue;
      }
      if (winSet.contains(lottos[i])) {
        rightNumSize++;
      }
    }
    if (zeroSize + rightNumSize == 0 || zeroSize + rightNumSize == 1) {
      return new int[] { 6, 6 };
    }

    int min = (rankDefault - rightNumSize) + 1;
    min = min > 6 ? 6 : min;

    int max = (rankDefault - (zeroSize + rightNumSize)) + 1;

    return new int[] { max, min };
  }
}