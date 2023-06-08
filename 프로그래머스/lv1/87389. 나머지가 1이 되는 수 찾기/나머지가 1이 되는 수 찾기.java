import java.util.stream.IntStream;

class Solution {
  public int solution(int n) {
    return IntStream.range(2, n+1).filter(i-> n%i==1).findFirst().orElse(-1);
  }
}