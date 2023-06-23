import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
  public String[] solution(String[] players, String[] callings) {
    List<String> answer = new ArrayList<>();
    Map<String, Integer> rankInfo = new HashMap<>();
    for (int i = 0; i < players.length; i++) {
      answer.add(players[i]);
      rankInfo.put(players[i], i);
    }

    for (String callName : callings) {
      int callIdx = rankInfo.get(callName);

      String upRankName = answer.get(callIdx);
      String downRankName = answer.get(callIdx - 1);

      rankInfo.put(upRankName, rankInfo.get(upRankName) - 1);
      rankInfo.put(downRankName, rankInfo.get(downRankName) + 1);

      answer.set(callIdx - 1, upRankName);
      answer.set(callIdx, downRankName);
    }
    return answer.toArray(String[]::new);
  }
}