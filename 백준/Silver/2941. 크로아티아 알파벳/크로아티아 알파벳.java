import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
  private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  private static Set<String> m = new LinkedHashSet<>() {
    {
      add("c=");
      add("c-");
      add("dz=");
      add("d-");
      add("lj");
      add("nj");
      add("s=");
      add("z=");
    }
  };

  public static void main(String[] args) throws Exception {
    String s = br.readLine();
    for (String r : m)
      s = s.replaceAll(r, "1");
    System.out.println(s.length());
  }
}
