import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Solution {
	public String solution(String cipher, int code) {
		return IntStream.range(code - 1, cipher.length())
			.filter(i -> i % code == code - 1)
			.mapToObj(i -> String.valueOf(cipher.charAt(i)))
			.collect(Collectors.joining());
	}
}