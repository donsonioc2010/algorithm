import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//16139
public class Main {
  private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

  public static void main(String[] args) throws Exception {
    String str = br.readLine();
    int[][] prefixAry = new int[26][str.length() + 1];

    for (int i = 1; i <= str.length(); i++) {
      char c = str.charAt(i - 1); // idx를 1부터 시작했기 때문
      for (int j = 0; j <= 25; j++)
        if (j == c - 'a')
          prefixAry[j][i] = prefixAry[j][i - 1] + 1;
        else
          prefixAry[j][i] = prefixAry[j][i - 1];
    }

    System.out.print(IntStream.range(0, Integer.parseInt(br.readLine())).mapToObj(i -> {
      Integer answer = null;
      try {
        StringTokenizer inSt = new StringTokenizer(br.readLine());
        char c = inSt.nextToken().charAt(0);
        int stNum = Integer.parseInt(inSt.nextToken());
        int endNum = Integer.parseInt(inSt.nextToken()) + 1;
        answer = prefixAry[c - 'a'][endNum] - prefixAry[c - 'a'][stNum];
      } catch (Exception e) {
      }
      return answer + "\n";
    }).collect(Collectors.joining()));
    ;
  }
}
