import java.util.Arrays;

class Solution {
  public int[] solution(int[] arr, int[][] queries) {
    Arrays.stream(queries).forEach(ary -> swap(arr, ary[0], ary[1]));
    return arr;
  }

  private void swap(int[] arr, int a, int b) {
    int temp = arr[a];
    arr[a] = arr[b];
    arr[b] = temp;
  }
}