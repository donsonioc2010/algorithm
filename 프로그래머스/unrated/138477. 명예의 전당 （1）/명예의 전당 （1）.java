import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Solution {
  public static void main(String[] args) {
    new Solution().solution(3, new int[] { 10, 100, 20, 150, 1, 100, 200 });
    new Solution().solution(4, new int[] { 0, 300, 40, 300, 20, 70, 150, 50, 500, 1000 });
  }

  public int[] solution(int k, int[] score) {
    List<Integer> answer = new ArrayList<>();
    List<Integer> list = new ArrayList<>();
    int min = Integer.MAX_VALUE;
    if (k > score.length) {
      for (int i = 0; i < score.length; i++) {
        min = Math.min(min, score[i]);
        answer.add(min);
      }
    } else {
      for (int i = 0; i < k; i++) {
        list.add(score[i]);
        list.sort(Comparator.reverseOrder());
        answer.add(list.get(list.size() - 1));
      }
      for (int i = k; i < score.length; i++) {
        if (score[i] < list.get(k - 1)) {
          answer.add(list.get(k - 1));
        } else {
          list.remove(k - 1);
          list.add(score[i]);
          list.sort(Comparator.reverseOrder());
          answer.add(list.get(k - 1));
        }
      }
    }
    return answer.stream().mapToInt(i -> i).toArray();
  }
}