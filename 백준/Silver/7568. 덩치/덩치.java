
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		//입력이 여러줄이 들어옴
		int N = Integer.parseInt(st.nextToken());
		int [][] dungChiPeople = new int[N][2];
		int [] count = new int[N];
		Arrays.fill(count, 1);
		
		//덩치맨들 배열에 박아넣기
		for(int i = 0; i < N; i++) {
			StringTokenizer peopleLine = new StringTokenizer(br.readLine());
			for(int j = 0; j < 2; j++) {
				dungChiPeople[i][j] = Integer.parseInt(peopleLine.nextToken());
			}
		}
		
		//비교
		for(int i =0; i< N-1; i++) {
			for(int j = i+1; j < N; j++) {
				if( (dungChiPeople[i][0] < dungChiPeople[j][0]) && 
						(dungChiPeople[i][1] < dungChiPeople[j][1])) {
					count[i] ++; 
				}else if( (dungChiPeople[i][0] > dungChiPeople[j][0]) && 
						(dungChiPeople[i][1] > dungChiPeople[j][1])) {
					count[j] ++;
				}
			}
		}
		String answer = Arrays.toString(count);
		answer = answer.trim().replace("[", "").replace("]", "").replace(",", "");
		System.out.println(answer);
	}
}