import java.util.Comparator;
import java.util.TreeSet;

class Solution {
  private String REMOVE_MAX = "D 1";
  private String REMOVE_MIN = "D -1";

  public int[] solution(String[] operations) {

    TreeSet<Integer> set = new TreeSet<>(Comparator.naturalOrder());

    for (int i = 0; i < operations.length; i++) {
      if (REMOVE_MAX.equals(operations[i])) {
        if (!set.isEmpty())
          set.remove(set.last());
      } else if (REMOVE_MIN.equals(operations[i])) {
        if (!set.isEmpty())
          set.remove(set.first());
      } else {
        set.add(Integer.valueOf(operations[i].split(" ")[1]));
      }
    }

    return set.isEmpty() ? new int[] { 0, 0 } : new int[] { set.last(), set.first() };
  }
}
