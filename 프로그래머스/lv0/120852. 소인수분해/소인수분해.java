import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

class Solution {
  public int[] solution(int n) {
    int[] ary = IntStream.range(2, n + 1).filter(i -> n % i == 0).toArray();
    Set<Integer> set = new HashSet<>();
    for (int i = 0; i < ary.length; i++) {
      int finalInt = i;
      if (ary[i] == IntStream.range(2, ary[i] + 1).filter(num -> ary[finalInt] % num == 0).findFirst().orElse(-1))
        set.add(ary[i]);
    }
    return set.stream().mapToInt(i -> i).sorted().toArray();
  }
}