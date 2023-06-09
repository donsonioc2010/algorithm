import java.util.HashMap;
import java.util.Map;

class Solution {
  public long solution(String numbers) {
    Map<Integer, String> map = new HashMap<>() {
      {
        put(0, "zero");
        put(1, "one");
        put(2, "two");
        put(3, "three");
        put(4, "four");
        put(5, "five");
        put(6, "six");
        put(7, "seven");
        put(8, "eight");
        put(9, "nine");
      }
    };

    for (int i = 0; i < 10; i++) {
      numbers = numbers.replace(map.get(i), String.valueOf(i));
    }

    return Long.parseLong(numbers);
  }
}