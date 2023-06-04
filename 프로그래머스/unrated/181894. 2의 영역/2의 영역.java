import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
  public int[] solution(int[] arr) {
    int[] count = IntStream.range(0, arr.length).filter(idx -> arr[idx] == 2).toArray();
    System.out.println(count.length);
    return count.length >= 2 ? Arrays.copyOfRange(arr, count[0], count[count.length-1]+1)
        : count.length == 1 ? new int[] { 2 } : new int[] { -1 };
  }
}