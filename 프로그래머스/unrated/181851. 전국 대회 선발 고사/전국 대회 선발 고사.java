import java.util.Arrays;
import java.util.Collections;

class Solution {
	public int solution(int[] rank, boolean[] attendance) {
		int cnt = 0;
		int answer = 0;
		int sortIdx = 0;
		int[] rankAry = Arrays.copyOfRange(rank, 0, rank.length);
		Arrays.sort(rankAry);
		for (; ; ) {
			if (cnt == 3)
				break;

			for (int i = 0; i < rank.length; i++) {
				if (rankAry[sortIdx] == rank[i]) {
					if (attendance[i]) {
						if (cnt == 0)
							answer += i * 10000;
						if (cnt == 1)
							answer += i * 100;
						if (cnt == 2)
							answer += i;
						cnt++;
					}
					sortIdx++;
					break;
				}
			}
		}
		return answer;
	}
}