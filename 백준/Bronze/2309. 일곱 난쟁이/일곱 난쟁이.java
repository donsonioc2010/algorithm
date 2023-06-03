
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//배열 = 9 = 9명
		int [] nanJang = new int[9];
		int totalKey = 0;
		int [] answer = new int[7];
		//난장이들아 배열로 드러가!
		for(int total_i = 0; total_i < 9; total_i++) {
			nanJang[total_i] = Integer.parseInt(br.readLine().trim());
			totalKey += nanJang[total_i];
		}
		Arrays.sort(nanJang);
		
		loopOut:
		for(int i = 0; i < nanJang.length - 1; i++) {
			for(int j = i +1; j < nanJang.length; j++ ) {
				int sum = nanJang[i] + nanJang[j];
				if((totalKey - sum) == 100) {
					for(int y = 0; y < nanJang.length; y++) {
						if(y != i && y != j) {
							System.out.println(nanJang[y]);
						}
					}
					break loopOut;
				}
			}
		}
		
		
		
	}
}