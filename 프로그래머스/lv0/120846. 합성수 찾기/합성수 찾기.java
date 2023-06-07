import java.util.stream.IntStream;

class Solution {
	public int solution(int n) {
		if (n <= 2) {
			return 0;
		}

		return (int)IntStream.range(3, n + 1).filter(i -> {
			if (i % 2 == 0)
				return true;
			for (int j = 3; j <= i; j++) {
				if (i % j == 0 && j != i)
					return true;
			}
			return false;
		}).count();
	}
}