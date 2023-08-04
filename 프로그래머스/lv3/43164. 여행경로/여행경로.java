import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

class Solution {
  public boolean[] visited;
  public LinkedList<String> list = new LinkedList<>();

  public String[] solution(String[][] tickets) {
    visited = new boolean[tickets.length];
    int cnt = 0;
    dfs("ICN", "ICN", tickets, cnt);
    Collections.sort(list);
    return list.get(0).split(" ");
  }

  private void dfs(String start, String route, String[][] tickets, int cnt) {
    if (cnt == tickets.length) {
      list.add(route);
      return;
    }

    for (int i = 0; i < tickets.length; i++) {
      if (start.equals(tickets[i][0]) && !visited[i]) {
        visited[i] = true;
        dfs(tickets[i][1], route + " " + tickets[i][1], tickets, cnt + 1);
        visited[i] = false;
      }
    }
  }
}