import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        IntStream.range(0, queries.length).forEach(
                i-> IntStream.range(queries[i][0], queries[i][1]+1).forEach(j-> arr[j]++)
    );
        return arr;
    }
}