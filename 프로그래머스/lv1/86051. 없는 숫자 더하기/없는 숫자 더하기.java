import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
  public int solution(int[] numbers) {
    boolean[] isIn = new boolean[10];
    Arrays.fill(isIn,true);
    for(int i : numbers) 
      isIn[i] = false;
    return IntStream.range(0, 10).filter(i-> isIn[i]).sum();
  }
}