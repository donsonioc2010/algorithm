import java.util.stream.IntStream;

class Solution {
  public String[] solution(String[] names) {
    return IntStream.range(0, names.length % 5 == 0 ? names.length / 5 :names.length / 5 + 1)
      .mapToObj(i -> names[i * 5 ]).toArray(String[]::new);
  }
}