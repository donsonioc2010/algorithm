import java.util.Arrays;

class Solution {
  public String solution(String s) {
    int[] ary = Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).sorted().toArray();
    return ary[0] + " " + ary[ary.length-1];
  }
}