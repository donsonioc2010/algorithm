import java.util.stream.IntStream;

class Solution {
  public int solution(int[] num_list) {
    return IntStream.range(0, num_list.length).map(i -> getCnt(num_list[i])).sum();
  }

  private int getCnt(int n) {
    if (n == 1)
      return 0;
    int cnt = 0;
    for (;;) {
      n = n % 2 == 0 ? n / 2 : (n - 1) / 2;
      cnt++;
      if (n <= 1)
        return cnt;
    }
  }
}