import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
  public String[] solution(String[] str_list) {
    int firstIdx = IntStream.range(0, str_list.length)
        .filter(idx -> str_list[idx].equals("l") || str_list[idx].equals("r"))
        .findFirst()
        .orElse(-1);

    if (firstIdx < 0)
      return new String[] {};

    return str_list[firstIdx].equals("l") ? Arrays.copyOfRange(str_list, 0, firstIdx)
        : Arrays.copyOfRange(str_list, ++firstIdx, str_list.length);
  }
}