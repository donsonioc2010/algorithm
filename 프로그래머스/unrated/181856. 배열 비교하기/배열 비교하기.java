import java.util.Arrays;

class Solution {
  public int solution(int[] arr1, int[] arr2) {
    if (arr1.length != arr2.length)
      return arr1.length < arr2.length ? -1 : 1;

    int arr1Sum = Arrays.stream(arr1).sum();
    int arr2Sum = Arrays.stream(arr2).sum();
    return arr1Sum == arr2Sum ? 0 : arr1Sum < arr2Sum ? -1 : 1;
  }
}