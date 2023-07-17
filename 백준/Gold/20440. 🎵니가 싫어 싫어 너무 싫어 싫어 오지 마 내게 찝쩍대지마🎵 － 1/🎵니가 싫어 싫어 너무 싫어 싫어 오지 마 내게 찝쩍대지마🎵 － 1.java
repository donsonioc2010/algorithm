import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {
  private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

  public static void main(String[] args) throws Exception {
    int N = Integer.parseInt(br.readLine());
    int[] stAry = new int[N + 1];
    int[] edAry = new int[N + 1];
    TreeSet<Integer> temp = new TreeSet<>();

    StringTokenizer st;
    for (int i = 0; i < N; i++) {
      st = new StringTokenizer(br.readLine());
      int start = Integer.parseInt(st.nextToken());
      int end = Integer.parseInt(st.nextToken());
      stAry[i] = start;
      edAry[i] = end;
      temp.add(start);
      temp.add(end);
    }

    List<Integer> idx = new ArrayList<>(temp);
    int[] sum = new int[idx.size()];

    for (int i = 0; i < N; i++) {
      int x = Collections.binarySearch(idx, stAry[i]);
      int y = Collections.binarySearch(idx, edAry[i]);
      for (int j = x; j < y; j++)
        sum[j]++;
    }

    int max = 0;
    int maxSt = -1;
    int maxEnd = -1;
    for (int i = 0; i < idx.size(); i++) {
      if (sum[i] > max) {
        maxSt = i;
        max = sum[i];
        maxEnd = i;
      }
      if (sum[i] == max && i - 1 == maxEnd)
        maxEnd = i;
    }
    System.out.println(max + "\n" + idx.get(maxSt) + " " + idx.get(maxEnd + 1));

  }
}
