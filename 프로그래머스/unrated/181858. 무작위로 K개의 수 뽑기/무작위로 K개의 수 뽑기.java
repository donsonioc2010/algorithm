import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution {
  public int[] solution(int[] arr, int k) {
    Set<Integer> duplicateKey = new HashSet<>();
    int[] answer = new int[k];
    int kIdx = 0;
    for (int i = 0; i < arr.length; i++) {
      if (kIdx >= k)
        break;
      if (!duplicateKey.contains(arr[i])) {
        duplicateKey.add(arr[i]);
        answer[kIdx++] = arr[i];
      }
    }
    if (kIdx < k) {
      for (int i = kIdx; i < k; i++) {
        answer[i] = -1;
      }
    }

    return answer;
  }
}