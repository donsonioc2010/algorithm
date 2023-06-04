import java.util.stream.IntStream;

class Solution {
  // 최대 answer은 1000이다.
  public int solution(int n) {
    return IntStream.range(0, 1001).filter(i -> (int) Math.pow(i, 2) == n).findFirst().orElse(2) == 2 ? 2 : 1;
  }
}