import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        //숫자 1, 2
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        // num 10000이하
        if(num1 > 10000 && num2 > 10000){
            return;
        }

        int ans1 = gcd(num1, num2);
        num1 = num1 / ans1;
        num2 = num2 / ans1;

        int ans2 = num1 * num2 * ans1;

        System.out.println(ans1);
        System.out.println(ans2);
		
	}
    private static int gcd(int num1, int num2){
        int mod = num1 % num2;

        if(mod == 0)
            return num2;
        else
            return gcd(num2, mod);
    }
}
