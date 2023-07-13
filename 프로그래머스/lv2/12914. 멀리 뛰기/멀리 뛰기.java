import java.math.BigDecimal;
import java.math.BigInteger;

class Solution {
  public long solution(int n) {
    if (n == 1) {
      return 1;
    }
    BigInteger modInt = new BigInteger("1234567");
    BigInteger[] big = new BigInteger[n + 1];
    big[0] = big[1] = BigInteger.ONE;
    for (int i = 2; i <= n; i++) {
      big[i] = big[i - 1].add(big[i - 2]).mod(modInt);
    }
    return big[n].longValue();
  }
}
