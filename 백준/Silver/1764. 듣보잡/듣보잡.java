import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Main {
  private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

  public static void main(String[] args) throws Exception {
    Set<String> listenSet = new HashSet<>();
    Set<String> answer = new TreeSet<>();

    String[] NM = br.readLine().split(" ");
    int N = Integer.parseInt(NM[0]);
    int M = Integer.parseInt(NM[1]);

    for (int i = 0; i < N; i++)
      listenSet.add(br.readLine());

    for (int i = 0; i < M; i++) {
      String noLook = br.readLine();
      if (listenSet.contains(noLook))
        answer.add(noLook);
    }

    StringBuilder sb = new StringBuilder(answer.size() + "\n")
        .append(answer.stream().collect(Collectors.joining("\n")));
    System.out.println(sb);
  }
}
