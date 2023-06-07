import java.util.stream.Collectors;

class Solution {
	public String solution(String my_string) {
		return my_string.chars().mapToObj(i -> {
			if (i >= 'A' && i <= 'Z')
				return (char)(i + 32) + "";
			else
				return (char)(i - 32) + "";
		}).collect(Collectors.joining());
	}
}