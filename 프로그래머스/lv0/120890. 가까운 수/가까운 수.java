class Solution {
	public int solution(int[] array, int n) {
		int min = array[0];
		for (int i = 1; i < array.length; i++) {
			int now = Math.abs(array[i] - n);
			int before = Math.abs(min - n);
			System.out.printf("min=%d, array[%d]=%d, now=%d, before=%d\n", min, i, array[i], now, before);
			if (now < before) {
				min = array[i];
			}else if(now == before){
				min = min <array[i]?min : array[i];
			}
		}
		return min;
	}
}