import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

class Solution {
  public int[] solution(int[] arr, int[][] intervals) {
    List<Integer> list = new ArrayList<>();

    IntStream.range(0, intervals.length).forEach(i -> {
      IntStream.range(intervals[i][0], intervals[i][1]+1).forEach(j -> list.add(arr[j]));
    });

    return list.stream().mapToInt(i -> i).toArray();
  }
}