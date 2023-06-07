import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

class Solution {
	public String solution(String my_string) {
		Set<String> contains = new HashSet<>();
		return Arrays.stream(my_string.split("")).filter(i-> {
			if(!contains.contains(i)) {
				contains.add(i);
				return true;
			}
			return false;
		}).collect(Collectors.joining());
	}
}