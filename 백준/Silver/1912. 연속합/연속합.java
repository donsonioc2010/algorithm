import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new getInput().getParameterBuf();
		int totalCnt = Integer.parseInt(br.readLine().trim());
		int maxInt = -1001; //-1000~1000까지만 들어오니까
		int particleInt = -1001;
		int[] splAry = new getInput().parseAry(new getInput().parseStr(br.readLine()), totalCnt);
		for(int i = 0; i < splAry.length; i++ ) {
			int number = splAry[i];
			particleInt =Integer.max(number, particleInt+number);
			maxInt = Integer.max(maxInt, particleInt);
		}
		System.out.println(maxInt);
	}
}
class getInput{
	public BufferedReader getParameterBuf() {
		return new BufferedReader(new InputStreamReader(System.in));
	}
	
	public StringTokenizer parseStr(String str) {
		return new StringTokenizer(str);
	}
	
	public int[] parseAry(StringTokenizer token, int totalCnt) {
		int [] data = new int[totalCnt];	//return 할 배열
		//int total = token.countTokens();	//총합계 
		
		int i = 0 ; //while을 사용하기 떄문
		while(token.hasMoreTokens()) {
			data[i] = Integer.parseInt(token.nextToken());
			i += 1;
		}
		
		return data;
	}
}