import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt(),cnt=99;
		if(N<100) 
			System.out.println(N);
		else{
			for(int i=100;i<=N;i++) { 
				if(i/100-(i/10)%10==(i/10)%10-i%10) 
					cnt++;
			}
			System.out.println(cnt);
		}
		sc.close();
	
	}
}