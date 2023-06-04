import java.util.Arrays;

class Solution {
  public int solution(int[] array) {
    Arrays.sort(array);
    System.out.println(array.length);
    return array[array.length / 2 ];
  }
}