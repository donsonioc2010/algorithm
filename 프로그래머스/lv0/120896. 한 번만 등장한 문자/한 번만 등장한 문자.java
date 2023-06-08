import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
  public String solution(String s) {
    return Arrays.stream(s.split(""))
        .filter(org -> Arrays.stream(s.split("")).filter(match -> org.equals(match)).count() == 1).sorted()
        .collect(Collectors.joining());
  }
}