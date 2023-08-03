import java.util.Arrays;

class Solution {
  public String solution(String number, int k) {
    int[] arr = Arrays.stream(number.split("")).mapToInt(Integer::parseInt).toArray();
    int length = arr.length - k;
    int start = 0;

    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < length; i++) {
      int max = Integer.MIN_VALUE;
      for (int j = start; j <= i + k; j++) {
        if (arr[j] > max) {
          max = arr[j];
          start = j + 1;
        }
      }
      sb.append(max);
    }
    return sb.toString();
  }
}