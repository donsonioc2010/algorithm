import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		int a,b;
		while(true){
		    a = sc.nextInt();
		    b = sc.nextInt();
		    if(0<a && b<10) break;
		}
		System.out.println(a+b);
	}

}