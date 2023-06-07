class Solution {
	public int solution(int n) {
		String[] num = String.valueOf(n).split("");
		int answer = 0;
		for (String s : num)
			answer += Integer.parseInt(s);

		return answer;
	}
}