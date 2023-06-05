import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        Set<Integer> delSet = Arrays.stream(delete_list).boxed().collect(Collectors.toSet());
        return IntStream.range(0, arr.length).filter(arrI->!delSet.contains(arr[arrI])).map(i-> arr[i]).toArray();
    }
}