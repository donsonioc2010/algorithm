import java.util.Arrays;

class Solution {
	public int solution(String my_string) {
		String[] split = my_string.split(" ");
		String[] numAry = Arrays.stream(split).filter(i-> !"+".equals(i) && !"-".equals(i)).toArray(String[]::new);
		String[] opAry = Arrays.stream(split).filter(i-> "+".equals(i) || "-".equals(i)).toArray(String[]::new);
		int sum = Integer.parseInt(numAry[0]);
		
		for(int i =0; i< opAry.length; i++) 
			sum = opAry[i].equals("+") ? sum + Integer.parseInt(numAry[i+1]) : sum - Integer.parseInt(numAry[i+1]);
		return sum;
	}
}