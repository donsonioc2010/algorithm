class Solution {
    public int solution(int n) {
		int max = 0;
		for( int i =1; i<= 15; i++) 
			if(fact(i) > n)
				return i-1;
		return -1;
	}

	private static int fact(int n) {
		if (n == 1) {
			return 1;
		}
		return n * fact(n - 1);
	}
}