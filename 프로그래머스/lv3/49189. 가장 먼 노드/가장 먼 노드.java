import java.util.*;

class Solution {

  public static void main(String[] args) {
    System.out.println(
        new Solution().solution(6,
            new int[][] { { 3, 6 }, { 4, 3 }, { 3, 2 }, { 1, 3 }, { 1, 2 }, { 2, 4 }, { 5, 2 } }));
  }

  public List<List<Integer>> list = new ArrayList<>();

  public int solution(int n, int[][] edge) {
    int[] visited = new int[n + 1];
    visited[1] = 1;

    for (int i = 0; i <= n; i++) {
      list.add(new ArrayList<Integer>());
    }

    for (int i = 0; i < edge.length; i++) {
      list.get(edge[i][0]).add(edge[i][1]);
      list.get(edge[i][1]).add(edge[i][0]);
    }

    Queue<Integer> q = new LinkedList<>();
    q.offer(1);
    while (!q.isEmpty()) {
      int num = q.poll();
      List<Integer> node = list.get(num);
      for (int i = 0; i < node.size(); i++) {
        int tempNodeNum = node.get(i);
        if (visited[tempNodeNum] == 0) {
          q.offer(tempNodeNum);
          visited[tempNodeNum] = visited[num] + 1;
        }
      }
    }
    int max = Arrays.stream(visited).max().orElse(-1);

    return (int) Arrays.stream(visited).filter(num -> num == max).count();
  }
}