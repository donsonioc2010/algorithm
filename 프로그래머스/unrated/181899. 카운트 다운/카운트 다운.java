import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;

class Solution {
  public int[] solution(int start, int end) {
    return IntStream.range(end, start + 1)
        .boxed()
        .sorted(Collections.reverseOrder())
        .mapToInt(value -> value.intValue())
        .toArray();
  }
}