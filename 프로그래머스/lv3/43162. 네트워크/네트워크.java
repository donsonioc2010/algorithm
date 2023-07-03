import java.util.LinkedList;
import java.util.Queue;
import java.util.Arrays;

class Solution {
  public int solution(int n, int[][] computers) {
    boolean[][] visited = new boolean[n][n];

    int networkCnt = 0;
    for (int i = 0; i < computers.length; i++) {
      for (int j = 0; j < computers.length; j++) {
        if (!visited[i][j] && computers[i][j] == 1 ) {
          networkCnt++;
          Queue<int[]> q = new LinkedList<>();
          visited[i][j] = visited[j][i]= true;
          q.offer(new int[] { i, j });
          while (!q.isEmpty()) {
            int[] visit = q.poll();
            for (int y = 0; y < computers[visit[1]].length; y++) {
              if (!visited[visit[1]][y] && computers[visit[1]][y] == 1 ) {
                  visited[visit[1]][y] = visited[y][visit[1]] = true;
                q.offer(new int[] { visit[1], y });
              }
            }
          }
        }
      }
    }
      for(int[] ary : computers) {
          System.out.println(Arrays.toString(ary));
      }
      for(boolean[] ary : visited) {
          System.out.println(Arrays.toString(ary));
      }
      
    System.out.println(networkCnt);
    return networkCnt;
  }

}