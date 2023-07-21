import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Main {
  private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

  public static void main(String[] args) throws Exception {
    List<N> m = new ArrayList<>();

    for (int i = 0; i <= 25; i++)
      m.add(new N((char) ('A' + i), 0));

    char[] cA = br.readLine().toUpperCase().toCharArray();
    if (cA.length == 1) {
      System.out.println(cA[0]);
      return;
    }
    for (char c : cA)
      for (N n : m)
        if (n.s == c)
          n.c = n.c + 1;
    PriorityQueue<N> p = new PriorityQueue<>(m);
    N f = p.poll();
    N s = p.poll();
    System.out.printf("%s", f.c == s.c ? "?" : f.s);
  }

  static class N implements Comparable<N> {
    char s;
    int c;

    N(char s, int c) {
      this.s = s;
      this.c = c;
    }

    @Override
    public int compareTo(N o) {
      return o.c - this.c;
    }
  }
}
