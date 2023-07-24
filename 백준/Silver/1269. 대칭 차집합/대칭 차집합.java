import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
  private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

  public static void main(String[] args) throws Exception {
    br.readLine(); // 첫째쭐 버림

    Set<Integer> a = new HashSet<>();
    Set<Integer> b = new HashSet<>();

    // a
    StringTokenizer st = new StringTokenizer(br.readLine());
    while (st.hasMoreTokens())
      a.add(Integer.parseInt(st.nextToken()));

    st = new StringTokenizer(br.readLine());
    while (st.hasMoreTokens())
      b.add(Integer.parseInt(st.nextToken()));

    Set<Integer> aAns = new HashSet<>();
    for (int num : a) {
      if (b.contains(num)) {
        b.remove(num);
      } else {
        aAns.add(num);
      }
    }
    System.out.println(aAns.size() + b.size());
  }
}
