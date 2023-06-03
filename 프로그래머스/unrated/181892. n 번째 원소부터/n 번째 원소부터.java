import java.util.Arrays;

class Solution {
  public int[] solution(int[] arr, int n) {
    return Arrays.copyOfRange(arr, n - 1, arr.length);
  }
}