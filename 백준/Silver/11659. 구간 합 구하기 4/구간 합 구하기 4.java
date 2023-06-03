
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader bufferReader = new BufferedReader(new InputStreamReader(System.in));

    StringTokenizer stringTokenizer = new StringTokenizer(bufferReader.readLine());

    int N = Integer.parseInt(stringTokenizer.nextToken());
    int M = Integer.parseInt(stringTokenizer.nextToken());

    long[] sumAry = new long[N + 1];

    stringTokenizer = new StringTokenizer(bufferReader.readLine());
    //구간합 배열 생성
    for (int i = 1; i <= N; i++) {
      sumAry[i] = sumAry[i - 1] + Integer.parseInt(stringTokenizer.nextToken());
    }

    for (int i = 0; i < M; i++) {
      // 구간합 범위
      stringTokenizer = new StringTokenizer(bufferReader.readLine());
      int A = Integer.parseInt(stringTokenizer.nextToken());
      int B = Integer.parseInt(stringTokenizer.nextToken());
      System.out.println(sumAry[B] - sumAry[A - 1]);
    }
  }
}
