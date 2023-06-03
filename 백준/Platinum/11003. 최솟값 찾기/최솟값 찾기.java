

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Main {

  public static final Scanner sc = new Scanner(System.in);

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    StringTokenizer st = new StringTokenizer(br.readLine());

    int N = Integer.parseInt(st.nextToken());
    int L = Integer.parseInt(st.nextToken());

    st = new StringTokenizer(br.readLine());
    Deque<Node> windowList = new ArrayDeque<>();

    for (int i = 0; i < N; i++) {
      int now = Integer.parseInt(st.nextToken());

      while (!windowList.isEmpty() && windowList.getLast().value > now) {
        windowList.removeLast();
      }
      windowList.addLast(new Node(now, i));

      if (windowList.getFirst().index <= i - L) {
        windowList.removeFirst();
      }
      bw.write(windowList.getFirst().value + " ");
    }
    bw.flush();
    bw.close();
  }

  static class Node {

    public int value;
    public int index;

    Node(int value, int index) {
      this.value = value;
      this.index = index;
    }
  }
}
