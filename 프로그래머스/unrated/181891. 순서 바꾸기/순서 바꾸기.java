import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

class Solution {
  public int[] solution(int[] num_list, int n) {
    List<Integer> list = new ArrayList<>();

    IntStream.range(n, num_list.length).forEach(i -> list.add(num_list[i]));
    IntStream.range(0, n).forEach(i -> list.add(num_list[i]));

    return list.stream().mapToInt(i -> i).toArray();
  }
}