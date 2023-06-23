import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

class Solution {
  Map<Integer, Integer> stageMap = new HashMap<>();
  Map<Integer, Double> data = new HashMap<>();

  public int[] solution(int N, int[] stages) {
    int totalPeople = stages.length;
    // Init
    IntStream.range(1, N + 2).forEach(i -> stageMap.put(i, 0));
    Arrays.stream(stages).forEach(i -> stageMap.put(i, stageMap.get(i) + 1));

    for (int i = 1; i <= N; i++) {
      int stopNum = stageMap.get(i);

      data.put(i, stopNum == 0 ? 0 : totalPeople == 0 ? 1 : (double) stopNum / (double) totalPeople);
      totalPeople -= stopNum;
    }

    return data.entrySet().stream().sorted((o1, o2) -> o2.getValue().compareTo(o1.getValue()))
        .mapToInt(Map.Entry::getKey).toArray();
  }
}
