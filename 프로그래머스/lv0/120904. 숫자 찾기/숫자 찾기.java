import java.util.stream.IntStream;
class Solution {
    public int solution(int num, int k) {
		return IntStream.range(1, String.valueOf(num).length()+1)
			.filter(i -> String.valueOf(num).charAt(i-1) == String.valueOf(k).charAt(0))
			.findFirst()
			.orElse(-1);
    }
}