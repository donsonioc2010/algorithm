import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

class Solution {
  Map<Integer, Integer> map = new HashMap<>();
  Queue<Gul> g = new PriorityQueue<>();

  public int solution(int k, int[] tangerine) {
    for (int size : tangerine) {
      if (map.containsKey(size))
        map.put(size, map.get(size) + 1);
      else
        map.put(size, 1);
    }

    map.entrySet().stream().forEach(o -> g.add(new Gul(o.getKey(), o.getValue())));

    int answer = 0;
    while (!g.isEmpty()) {
      k -= g.poll().num;
      answer++;
      if (k <= 0)
        break;
    }

    return answer;
  }

  static class Gul implements Comparable<Gul> {
    int size;
    int num;

    Gul(int size, int num) {
      this.size = size;
      this.num = num;
    }

    @Override
    public String toString() {
      return String.format("([Size]:%d, [num]:%d)", size, num);
    }

    @Override
    public int compareTo(Solution.Gul o) {
      return o.num - this.num;
    }
  }
}