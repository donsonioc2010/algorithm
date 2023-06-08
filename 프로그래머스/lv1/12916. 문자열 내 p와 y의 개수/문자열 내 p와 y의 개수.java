import java.util.Arrays;

class Solution {
  boolean solution(String s) {
    return Arrays.stream(s.split("")).filter(i -> "p".equalsIgnoreCase(i)).count() == Arrays.stream(s.split(""))
        .filter(i -> "y".equalsIgnoreCase(i)).count() ? true : false;
  }
}