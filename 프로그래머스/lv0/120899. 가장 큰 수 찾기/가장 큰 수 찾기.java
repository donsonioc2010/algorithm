import java.util.stream.IntStream;

class Solution {
	public int[] solution(int[] array) {
		int max = array[0];
		for (int i = 1; i < array.length; i++) {
			max = Math.max(max, array[i]);
		}
		int finalMax = max;
		return new int[] {
			max, IntStream.range(0, array.length).filter(i -> finalMax == array[i]).findFirst().orElse(-1)
		};
	}
}