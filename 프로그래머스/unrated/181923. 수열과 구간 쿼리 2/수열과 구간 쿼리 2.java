
import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        return IntStream.rangeClosed(0, queries.length - 1)
            .map(num -> getNum(queries[num], arr))
            .toArray();
    }

    private int getNum(int[] query, int[] arr) {
        int[] result = IntStream.range(query[0], query[1] + 1)
            .filter(num -> arr[num] > query[2])
            .map(num -> arr[num])
            .sorted()
            .toArray();
        return result.length == 0 ? -1 : result[0];
    }
}