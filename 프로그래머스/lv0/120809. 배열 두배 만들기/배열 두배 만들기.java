import java.util.stream.IntStream;

class Solution {
  public int[] solution(int[] numbers) {
    return IntStream.range(0, numbers.length).map(i->numbers[i]*2).toArray();
  }
}