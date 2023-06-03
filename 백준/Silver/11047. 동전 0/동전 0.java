import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = 0,n = sc.nextInt(), k = sc.nextInt();

        int []coin = new int[n];
        getCoinCollection(coin, sc);

        for(int i = n-1; i>=0; i--){
            m += (k/coin[i]);
            k = k%coin[i];
        }
        System.out.println(m);
    }

    static void getCoinCollection(int[] n, Scanner sc){
        for(int i = 0; i < n.length; i++){
            n[i] = sc.nextInt();
        }
        sc.close();
    }
}