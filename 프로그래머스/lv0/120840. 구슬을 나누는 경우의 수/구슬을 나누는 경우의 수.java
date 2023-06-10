import java.math.BigInteger;

class Solution {
  public int solution(int balls, int share) {
    if (balls == share)
      return 1;
    return new BigInteger(String.valueOf(facto(balls))).divide(facto(balls - share).multiply(facto(share))).intValue();
  }

  private BigInteger facto(int n) {
    if (n <= 1)
      return new BigInteger(String.valueOf(n));
    return new BigInteger(String.valueOf(n)).multiply(facto(n - 1));
  }
}