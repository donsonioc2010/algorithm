import java.util.stream.IntStream;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        IntStream.range(0, queries.length)
                .forEach(i -> IntStream
                        .range(queries[i][0], queries[i][1]+1 )
                        .forEach(j -> {
                            int k = queries[i][2];
                            if (j==0 ||(j % k == 0 && k <= j )){
                                arr[j]++;
                            }
                        })
                );
        return arr;
    }
}