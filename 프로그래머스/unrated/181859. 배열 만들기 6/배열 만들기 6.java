import java.util.ArrayList;
import java.util.List;

class Solution {
  public int[] solution(int[] arr) {
    List<Integer> list = new ArrayList<>();
    list.add(arr[0]);

    for (int i = 1; i < arr.length; i++) {
      if (list.size() > 0) {
        if (list.get(list.size() - 1) == arr[i])
          list.remove(list.size() - 1);
        else
          list.add(arr[i]);
      } else
        list.add(arr[i]);
    }
    if (list.size() == 0)
      list.add(-1);

    return list.stream().mapToInt(i -> i).toArray();
  }
}