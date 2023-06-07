import java.util.stream.IntStream;

class Solution {
	public String[] solution(String my_str, int n) {
		return IntStream.range(0, my_str.length()%n==0? my_str.length()/n:my_str.length()/n+1)
			.mapToObj(i-> {
				if((i+1)*n < my_str.length())
					return my_str.substring(i*n, (i+1)*n);
				return my_str.substring(i*n);
			}).toArray(String[]::new);
	}
}