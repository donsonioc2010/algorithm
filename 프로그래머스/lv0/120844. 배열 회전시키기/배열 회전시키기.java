class Solution {
	public int[] solution(int[] numbers, String direction) {
		int temp = 0;
		if("right".equals(direction)){
			temp = numbers[numbers.length-1];
			for(int i = numbers.length-1; i >= 1; i--)
				numbers[i] = numbers[i-1];
			numbers[0] = temp;
			return  numbers;
		}
		temp = numbers[0];
		for(int i =1; i< numbers.length; i++)
			numbers[i-1] = numbers[i];
		numbers[numbers.length-1] = temp;
		return numbers;
	}
}