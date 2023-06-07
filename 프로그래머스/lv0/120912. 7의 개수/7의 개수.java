import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
	public int solution(int[] array) {
		return IntStream.range(0, array.length)
			.map(i -> (int)Arrays.stream(String.valueOf(array[i]).split("")).filter(j -> "7".equals(j)).count())
			.sum();
	}
}