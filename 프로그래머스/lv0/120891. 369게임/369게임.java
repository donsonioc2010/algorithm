import java.util.Arrays;
class Solution {
	public int solution(int order) {
		return (int)Arrays.stream(String.valueOf(order).split("")).filter(i-> "3".equals(i) || "6".equals(i)|| "9".equals(i)).count();
	}
}