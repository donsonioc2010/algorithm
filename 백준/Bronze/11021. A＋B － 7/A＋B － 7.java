import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		int A,B,C;
        A = sc.nextInt();
        for(int i = 0; i<A; i++){
            B = sc.nextInt();
            C = sc.nextInt();
            System.out.println("Case #"+(i+1)+": "+(B+C));
		
        }
	}

}