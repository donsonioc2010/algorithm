import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
	public int[][] solution(int[][] arr) {
		int max = arr.length;
		for (int i = 0; i < arr.length; i++) {
			max = Math.max(max, arr[i].length);
		}
		int[][] answer = new int[max][max];
		for (int i = 0; i < max; i++) {
			for (int j = 0; j < max; j++) {
				if (i < arr.length)
					if (j < arr[i].length)
						answer[i][j] = arr[i][j];
					else
						answer[i][j] = 0;
				else
					answer[i][j] = 0;

			}
		}

		return answer;
	}
}