import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
	public int solution(int i, int j, int k) {
		return IntStream.range(i, j+1)
			.map(idx -> (int)(Arrays.stream(String.valueOf(idx).split(""))
				.filter(c -> String.valueOf(k).equals(c))
				.count()))
			.sum();
	}
}