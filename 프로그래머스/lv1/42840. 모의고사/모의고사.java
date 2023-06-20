/*
1 : 1,2,3,4,5
2 : 2,1,2,3,2,4,2,5
3 : 3,3,1,1,2,2,4,4,5,5
*/

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

class Solution {
  public int[] solution(int[] answers) {
    int[] cnt = { 0, 0, 0 };
    Map<Integer, Integer[]> rule = new HashMap<>() {
      {
        put(1, new Integer[] { 1, 2, 3, 4, 5 });
        put(2, new Integer[] { 2, 1, 2, 3, 2, 4, 2, 5 });
        put(3, new Integer[] { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 });
      }// i % arr.length;
    };

    for (int i = 1; i <= 3; i++) {
      Integer[] answerRule = rule.get(i);
      for (int j = 0; j < answers.length; j++) {
        if (answers[j] == answerRule[j % answerRule.length]) {
          cnt[i - 1]++;
        }
      }
    }

    int max = Integer.MIN_VALUE;

    for (int i = 0; i < cnt.length; i++) {
      max = Math.max(max, cnt[i]);
    }
    int finalMax = max;
    return IntStream.range(1, 4).filter(i -> cnt[i-1] == finalMax).toArray();
  }
}