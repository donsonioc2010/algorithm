import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
  private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

  public static void main(String[] args) throws Exception {
    int T = Integer.parseInt(br.readLine());
    StringBuffer sb = new StringBuffer();
    for (int i = 0; i < T; i++) {
      String[] sary = br.readLine().split("");
      int[] score = new int[sary.length];

      score[0] = "O".equals(sary[0]) ? 1 : 0;
      for (int j = 1; j < sary.length; j++) {
        score[j] = "O".equals(sary[j]) ? score[j - 1] + 1 : 0;
      }
      sb.append(Arrays.stream(score).sum()).append("\n");
    }
    System.out.println(sb);
  }
}
