import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

class Solution {
        public int[] solution(int[] arr) {
        List<Integer> stk = new ArrayList<>();
        IntStream.range(0, arr.length).forEach(num -> {
            if (stk.size() == 0) {
                stk.add(arr[num]);
            } else {
                for (int i = stk.size() - 1; i >= -1; i--) {
                    if (i==-1 || stk.get(i) < arr[num]) {
                        break;
                    }
                    if (stk.get(i) >= arr[num])
                        stk.remove(i);
                }
                stk.add(arr[num]);
            }
        });

        return stk.stream().mapToInt(i -> i).toArray();
    }
}