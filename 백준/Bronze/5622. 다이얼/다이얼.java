import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
  private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

  public static void main(String[] args) throws Exception {
    Map<Integer, Set<String>> map = new HashMap<>();
    int ch = 0;
    for (int i = 0; i <= 9; i++)
      map.put(i, new HashSet<>());

    for (int i = 2; i <= 6; i++) {
      Set<String> gS = map.get(i);
      for (int j = 0; j < 3; j++)
        gS.add(String.valueOf((char) ('A' + ch++)));
    }
    Set<String> gS = map.get(7);
    for (int j = 0; j < 4; j++)
      gS.add(String.valueOf((char) ('A' + ch++)));
    gS = map.get(8);
    for (int j = 0; j < 3; j++)
      gS.add(String.valueOf((char) ('A' + ch++)));
    gS = map.get(9);
    for (int j = 0; j < 4; j++)
      gS.add(String.valueOf((char) ('A' + ch++)));
    map.get(0).add("OPERATION");

    String[] s = br.readLine().split("");
    int n = 0;
    for (String c : s) {
      for (int i = 2; i <= 9; i++) {
        if (map.get(i).contains(c)) {
          n += i + 1;
          break;
        }
      }
    }
    System.out.println(n);
  }
}
