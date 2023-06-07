import java.util.stream.IntStream;

class Solution {
    static int idx = 0;
	public int[][] solution(int[] num_list, int n) {
		return IntStream.range(1, num_list.length/n+1).mapToObj(i->
			IntStream.range(1, n+1).map( j-> num_list[idx++]).toArray()
		).toArray(int[][]::new);
	}
}