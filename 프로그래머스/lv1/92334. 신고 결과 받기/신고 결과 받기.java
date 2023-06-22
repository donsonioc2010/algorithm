import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

class Solution {
  private Map<String, Set<String>> warningList = new HashMap<>();

  public int[] solution(String[] id_list, String[] report, int k) {
    // Init Map And Set
    Arrays.stream(id_list).forEach(name -> warningList.put(name, new HashSet<String>()));
    // Map.Set Add
    Arrays.stream(report).forEach(reportLine -> {
      String[] split = reportLine.split(" ");
      warningList.get(split[1]).add(split[0]);
    });

    List<String> stopIdList = Arrays.stream(id_list).filter(name -> warningList.get(name).size() >= k)
        .collect(Collectors.toList());

    int[] answer = Arrays.stream(id_list).mapToInt(name -> stopIdList.stream()
        .filter(stopName -> warningList.get(stopName).contains(name)).mapToInt(warningName -> 1).sum()).toArray();
    return answer;
  }
}