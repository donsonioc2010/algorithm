import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

class Solution {
  public int[] solution(int[] emergency) {
    int[] sorted = Arrays.stream(Arrays.copyOfRange(emergency, 0, emergency.length)).boxed()
        .sorted(Comparator.reverseOrder()).mapToInt(i -> i).toArray();
    return Arrays.stream(emergency)
        .map(i -> IntStream.range(0, sorted.length).filter(idx -> i == sorted[idx]).findFirst().orElse(-1))
        .map(i -> i + 1).toArray();
  }
}