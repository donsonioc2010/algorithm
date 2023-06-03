
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main{

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    long[] A = new long[N];
    StringTokenizer st = new StringTokenizer(br.readLine());

    for (int i = 0; i < N; i++) {
      A[i] = Long.parseLong(st.nextToken());
    }
    Arrays.sort(A);
    int count = 0;
    for (int i = 0; i < N; i++) {
      long findNum = A[i];
      int start = 0;
      int end = N - 1;

      while (true) {
        if (start == i) {
          start++;
        } else if (end == i) {
          end--;
        }

        if (start == end) {
          break;
        }
        long sum = A[start] + A[end];
        if (sum > findNum) {
          end--;
        } else if (sum < findNum) {
          start++;
        } else {
          count++;
          break;
        }
      }
    }
    System.out.println(count);
    br.close();
  }
}