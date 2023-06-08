import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
  public int solution(String s) {

    String[] splitAry = s.split(" ");
    return Arrays.stream(splitAry).filter(str -> !str.equals("Z")).mapToInt(Integer::parseInt).sum()
        - IntStream.range(0, splitAry.length).filter(i -> splitAry[i].equals("Z"))
            .map(i -> Integer.parseInt(splitAry[i - 1])).sum();
  }
}