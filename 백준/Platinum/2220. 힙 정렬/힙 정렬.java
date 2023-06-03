import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] aryN = new int[n + 1];                // 배열 1번부터 써야하기에
        for (int i = 1; i < n; i++) {               // start I for
            for (int j = i; j > 1; j /= 2) {
                aryN[j] = aryN[j / 2];              // Node Swap
            }
            aryN[1] = i + 1;                        //1은 마지막에 넣음, 2부터 차근히 넣고 돌림.
        }                                           //End I for
        aryN[n] = 1;                                // 마지막 방에 1

        for (int i = 1; i <= n; i++) {
            System.out.print(aryN[i] + " ");
        }
	}

}
