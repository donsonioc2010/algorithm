import java.util.stream.IntStream;

class Solution {
  public int solution(int[] num_list) {
    return Math.max(
        IntStream
            .range(0, num_list.length)
            .boxed()
            .filter(idx -> (idx + 1) % 2 == 1)
            .mapToInt(idx -> num_list[idx])
            .sum(),
        IntStream
            .range(0, num_list.length)
            .boxed()
            .filter(idx -> (idx + 1) % 2 == 0)
            .mapToInt(idx -> num_list[idx])
            .sum());
  }
}