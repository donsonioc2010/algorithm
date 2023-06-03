import java.util.stream.IntStream;

class Solution {
  public int solution(int[] arr, int idx) {
    return IntStream
        .range(idx, arr.length)
        .filter(sIdx -> arr[sIdx] == 1)
        .findFirst()
        .orElse(-1);
  }
}