import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

class Solution {
  public int[] solution(String[] name, int[] yearning, String[][] photo) {

    Map<String, Integer> scoreMap = new HashMap<>();

    for (int i = 0; i < yearning.length; i++) {
      scoreMap.put(name[i], yearning[i]);
    }

    return IntStream.range(0, photo.length).map(
        i -> IntStream.range(0, photo[i].length)
            .map(j -> scoreMap.containsKey(photo[i][j]) ? scoreMap.get(photo[i][j]) : 0)
            .sum())
        .toArray();
  }
}