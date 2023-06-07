import java.util.stream.IntStream;

class Solution {
	public int solution(int[] array, int height) {
		return (int)IntStream.range(0, array.length).filter(i -> array[i]>height).count();
	}
}