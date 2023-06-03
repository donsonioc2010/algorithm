import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int answer = fibo(sc.nextInt());
        System.out.println(answer);
    }
    public static int fibo(int n){
        switch(n){
            case 0:
                return 0;
            case 1:
                return 1;
            default:
                return fibo(n -1) + fibo(n -2);
        }
    }
}
