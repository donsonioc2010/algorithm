import java.util.stream.IntStream;

class Solution {
  public String solution(String[] my_strings, int[][] parts) {
    StringBuffer sb = new StringBuffer();
    IntStream.range(0, parts.length).boxed().forEach(i -> {
      IntStream.range(parts[i][0], parts[i][1]+1).forEach(idx -> sb.append(my_strings[i].charAt(idx)));
    });
    return sb.toString();
  }
}