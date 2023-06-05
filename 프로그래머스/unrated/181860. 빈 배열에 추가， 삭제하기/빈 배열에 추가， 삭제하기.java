import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        List<Integer> list = new ArrayList<>();

        IntStream.range(0, arr.length).forEach(i -> {
            if (flag[i]) {
                IntStream.range(0, arr[i] * 2).forEach(ai -> list.add(arr[i]));
            } else {
                IntStream.range(0, arr[i]).forEach(ri -> {
                    if (list.size() != 0)
                        list.remove(list.size() - 1);
                });
            }
        });
        return list.stream().mapToInt(i -> i).toArray();
    }
}