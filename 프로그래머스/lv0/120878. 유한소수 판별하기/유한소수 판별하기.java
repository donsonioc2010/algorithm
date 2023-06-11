import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

class Solution {
  public int solution(int a, int b) {
    if (b == 1) {
      return 1;
    }
    // 기약분수 제작 완료
    int gcdNum = gcd(a, b);
    int bunMo = b / gcdNum;

    if (bunMo == 1 || bunMo == 2 || bunMo == 5) {
      return 1;
    }
    Set<Integer> prime = new HashSet<>();
    int[] ary = IntStream.range(2, bunMo + 1).filter(i -> bunMo % i == 0).toArray();
    for (int num : ary) {
      prime.add(IntStream.range(2, num + 1).filter(i -> num % i == 0).findFirst().orElse(-1));
    }
    boolean result = false;
    for (Integer key : prime) {
      if (key == 2 || key == 5) {
        result = true;
      }else{
          result = false;
          break;
      }
    }
    return result ? 1 : 2;
  }

  private static int gcd(int n1, int n2) {
    int mod = n1 % n2;
    return mod == 0 ? n2 : gcd(n2, mod);
  }
}