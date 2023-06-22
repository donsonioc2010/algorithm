import java.util.HashMap;
import java.util.Map;

class Solution {
  Map<String, Integer> map = new HashMap<>();

  public String solution(String[] participant, String[] completion) {
    for (int i = 0; i < participant.length; i++)
      if (map.containsKey(participant[i]))
        map.put(participant[i], map.get(participant[i]) + 1);
      else
        map.put(participant[i], 1);

    for (int i = 0; i < completion.length; i++)
      map.put(completion[i], map.get(completion[i]) - 1);

    return map.keySet().stream().filter(name -> map.get(name) > 0).findFirst().orElse("");
  }
}