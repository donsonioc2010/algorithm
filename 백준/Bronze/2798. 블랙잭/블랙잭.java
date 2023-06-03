
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int totalCardNum = Integer.parseInt(st.nextToken());	//N
		int scoreNum = Integer.parseInt(st.nextToken());		//M

		st = new StringTokenizer(br.readLine());
		int [] cardList = new int[totalCardNum];
		
		int idx = 0; 
		while(st.hasMoreElements()) {
			cardList[idx] = Integer.parseInt(st.nextToken());
			idx++;
		}
		
		int maxNum = 0;
		for(int i = 0; i < cardList.length; i++) 
			for(int j = 0; j < cardList.length; j++) 
				if(j != i) 
					for(int x = 0; x < cardList.length; x++) 
						if(x != j && x != i) 
							if(cardList[i] + cardList[j] + cardList[x] <= scoreNum)
								maxNum = Integer.max(cardList[i] + cardList[j] + cardList[x], maxNum);
						
					
				
			
		
		System.out.println(maxNum);
	}
}