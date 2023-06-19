import java.util.Arrays;

class Solution {

  public int[][] solution(int[][] arr1, int[][] arr2) {
    int[][] answer = new int[arr1.length][arr1.length];

    for (int i = 0; i < arr1.length; i++) { // arr1 첫번째 인자
      int[] temp = new int[arr2[0].length];

      for (int j = 0; j < arr1[i].length; j++) {
        for (int k = 0; k < arr2[j].length; k++) {
          temp[k] += arr1[i][j] * arr2[j][k];
        }
      }
      answer[i] = Arrays.copyOf(temp, temp.length);
    }

    return answer;
  }
}