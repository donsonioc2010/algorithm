import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
  private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

  public static void main(String[] args) throws Exception {
    String[] NT = br.readLine().split(" ");

    int N = Integer.parseInt(NT[0]);
    Map<String, Integer> strKeyMap = new HashMap<>();
    Map<Integer, String> intKeyMap = new HashMap<>();

    for (int i = 1; i <= N; i++) {
      String name = br.readLine();
      strKeyMap.put(name, i);
      intKeyMap.put(i, name);
    }

    StringBuilder sb = new StringBuilder();
    int T = Integer.parseInt(NT[1]);
    for (int i = 0; i < T; i++) {
      String in = br.readLine();
      sb.append(strKeyMap.containsKey(in) ? strKeyMap.get(in) : intKeyMap.get(Integer.parseInt(in)))
          .append("\n");
    }
    System.out.println(sb);
  }
}
