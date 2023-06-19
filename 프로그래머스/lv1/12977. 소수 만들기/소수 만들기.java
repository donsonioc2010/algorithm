class Solution {
  public int solution(int[] nums) {

    int cnt = 0;
    for (int i = 0; i < nums.length - 2; i++) {
      for (int j = i + 1; j < nums.length - 1; j++) {
        for (int k = j + 1; k < nums.length; k++) {
          boolean isPrime = true;
          int sum = nums[i] + nums[j] + nums[k];
          for (int x = 2; x < sum; x++) {
            if (sum % x == 0) {
              isPrime = false;
              break;
            }
          }
          if (isPrime) {
            cnt++;
          }
        }
      }
    }
    return cnt;
  }
}