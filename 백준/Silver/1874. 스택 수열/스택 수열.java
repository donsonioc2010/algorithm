

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

  public static void main(String[] args) throws IOException {
    //초기값 셋팅
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int N = Integer.parseInt(br.readLine());

    int[] A = new int[N];
    for (int i = 0; i < N; i++) {
      A[i] = Integer.parseInt(br.readLine());
    }

    boolean result = true;
    Stack<Integer> S = new Stack<Integer>();
    StringBuffer sb = new StringBuffer();
    int NUM = 1;

    for (int i = 0; i < N; i++) {
      int ANUM = A[i];
      if (ANUM >= NUM) {
        while (ANUM >= NUM) {
          S.push(NUM++);
          sb.append("+\n");
        }
        //NUM이 ANUM(입력된값)까지 도달한 이후 해당 값을 Stack에서 Pop
        S.pop();
        sb.append("-\n");
      } else { // 입력된 값이 수열와 일치하지 않는 경우(오름차순의 표현이 불가능함)
        int POPNUM = S.pop();
        if (POPNUM != ANUM) {
          System.out.println("NO");
          result = false;
          break;
        } else {
          sb.append("-\n");
        }
      }
    }

    if (result) {
      System.out.println(sb.toString());
    }

  }
}
