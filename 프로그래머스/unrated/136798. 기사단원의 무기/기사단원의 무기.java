import java.util.HashMap;
import java.util.Map;

class Solution {
  public static void main(String[] args) {
    System.out.println(new Solution().solution(5, 3, 2));
    System.out.println(new Solution().solution(10, 3, 2));
  }

  Map<Integer, Integer> num;

  public int solution(int number, int limit, int power) {
    int answer = 1;
    for (int i = 2; i <= number; i++) {
      num = new HashMap<>();
      setMap(i);
      int temp = 1;
      for (int a : num.values()) {
        temp *= (a + 1);
      }
      answer += temp > limit ? power : temp;
    }
    System.out.println(answer);
    return answer;
  }

  public void setMap(int n) {
    if (n <= 1) {
      return;
    }
    for (int i = 2; i <= n; i++) {
      if (n % i == 0) {
        n = n / i;
        num.put(i, num.containsKey(i) ? num.get(i) + 1 : 1);
        break;
      }
    }
    setMap(n);
  }
}