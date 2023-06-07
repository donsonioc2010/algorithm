class Solution {
	public int solution(int[] sides) {
		int maxIdx = 0;
		int max = sides[0];
		for(int i =1; i < sides.length; i++) {
			if(sides[i] > max) {
				max = sides[i];
				maxIdx = i;
			}
		}
		int sum = 0;
		for(int i =0 ; i< sides.length; i++) {
			if(i != maxIdx)
				sum += sides[i];
		}
		
		return max >= sum ? 2:1;
	}
}