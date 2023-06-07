import java.util.stream.Collectors;

// 가위는 2, 바위는 0, 보는 5
class Solution {
	public String solution(String rsp) {
		return rsp.chars().mapToObj(i-> {
			if(i=='2')
				return "0";
			if(i=='0')
				return "5";
			return "2";
		}).collect(Collectors.joining());
	}
}