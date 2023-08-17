import java.util.*;

class Solution {
  Set<Integer> set = new TreeSet<>();

  public int solution(int[] elements) {
    for (int i = 0; i < elements.length; i++)
      set.add(elements[i]);

    for (int i = 2; i <= elements.length; i++) {
      for (int j = 0; j < elements.length; j++) {
        int cnt = 0;
        int idx = j;
        int sum = 0;
        while (cnt < i) {
          sum += elements[idx++ % elements.length];
          cnt++;
        }
        set.add(sum);
      }
    }

    return set.size();
  }
}