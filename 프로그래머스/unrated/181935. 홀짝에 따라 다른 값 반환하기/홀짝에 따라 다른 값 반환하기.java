import java.util.stream.IntStream;

class Solution {
  public int solution(int n) {
        return n % 2 == 1 ? IntStream.range(1, n+1).filter(num -> num % 2 == 1).sum()
        : IntStream.range(1, n+1).filter(num -> num % 2 == 0).map(num-> num*num).sum();
  }
}