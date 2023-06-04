import java.util.stream.IntStream;

class Solution {
  public int solution(String[] order) {
    return IntStream.range(0, order.length).map(i -> {
      if (order[i].contains("americano") || order[i].contains("anything"))
        return 4500;
      return 5000;
    }).sum();
  }
}