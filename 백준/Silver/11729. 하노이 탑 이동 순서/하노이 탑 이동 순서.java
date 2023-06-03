import java.util.*;

public class Main {
    private static int cnt = 0;
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        if(n >= 1 && n <= 20){  
            StringBuilder sb = new StringBuilder();
            doHanoi(sb, n, "1", "3", "2");
            System.out.println(cnt);
            System.out.println(sb.toString());
        }
	}
    private static void doHanoi(StringBuilder sb, int n, String st, String to, String via){
        if(n==1){
            moveWonPan(sb, n, st, to);
        }else{
            doHanoi(sb, n-1, st, via, to);
            moveWonPan(sb, n, st, to);
            doHanoi(sb,n-1, via, to, st);
        }
    }

    private static void moveWonPan(StringBuilder sb, int n, String st, String to){
        sb.append(st).append(" ").append(to).append("\n");
        cnt++;
    }
}
