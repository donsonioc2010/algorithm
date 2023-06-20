import java.util.HashSet;
import java.util.Set;

class Solution {
  public int solution(int[] nums) {

    Set<Integer> type = new HashSet<>();
    for (int i = 0; i < nums.length; i++) {
      type.add(nums[i]);
    }

    int N = nums.length / 2;
    return type.size() < N ? type.size() : N;
  }
}