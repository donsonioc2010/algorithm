import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

class Solution {
  public static void main(String[] args) {
    System.out.println(new Solution().solution(10, new int[] { 3, 4, 9, 7 }, new int[] { 2, 3, 8 }));
  }

  public int solution(int n, int[] lost, int[] reserve) {
    Set<Integer> lostSet = new TreeSet<>();
    Set<Integer> reserveSet = new TreeSet<>();
    List<Integer> getClothes = new ArrayList<>();

    for (int i = 0; i < reserve.length; i++)
      reserveSet.add(reserve[i]);

    for (int i = 0; i < lost.length; i++) {
      if (reserveSet.contains(lost[i])) {
        reserveSet.remove(lost[i]);
      } else {
        lostSet.add(lost[i]);
      }
    }

    for (int lostNum : lostSet) {
      if (reserveSet.contains(lostNum - 1)) {
        reserveSet.remove(lostNum - 1);
        getClothes.add(lostNum);
        continue;
      }
      if (reserveSet.contains(lostNum + 1)) {
        reserveSet.remove(lostNum + 1);
        getClothes.add(lostNum);
      }
    }

    return n - (lostSet.size() - getClothes.size());
  }
}