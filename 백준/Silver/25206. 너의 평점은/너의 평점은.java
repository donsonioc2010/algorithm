import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
  private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

  private static Map<String, Double> m = new HashMap<>() {
    {
      put("A+", 4.5);
      put("A0", 4.0);
      put("B+", 3.5);
      put("B0", 3.0);
      put("C+", 2.5);
      put("C0", 2.0);
      put("D+", 1.5);
      put("D0", 1.0);
      put("F", 0.0);
    }
  };

  public static void main(String[] args) throws Exception {
    double d = 0;
    double hackjum = 0.0;
    String[][] score = new String[20][3];
    for (int i = 0; i < 20; i++) {
      score[i] = br.readLine().split(" ");
      if (m.containsKey(score[i][2])) {
        d += Double.valueOf(score[i][1]) * Double.valueOf(m.get(score[i][2]));
        hackjum += Double.valueOf(score[i][1]);
      }
    }
    System.out.println(d / hackjum);

  }
}
