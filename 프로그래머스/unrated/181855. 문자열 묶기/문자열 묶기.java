import java.util.Arrays;

class Solution {
  public int solution(String[] strArr) {
    int[] lengthAry = new int[31]; // 원쇠 최대 길이
    Arrays.fill(lengthAry, 0);
    for (int i = 0; i < strArr.length; i++) {
      lengthAry[strArr[i].length()]++;
    }
    int max = lengthAry[1];
    for (int i = 2; i < lengthAry.length; i++) {
      max = Math.max(max, lengthAry[i]);
    }

    return max;
  }
}