import java.util.stream.LongStream;

class Solution {
  public long solution(int price, int money, int count) {
    long needMoney = money - LongStream.range(1, count + 1).map(i -> price * i).sum();
    return needMoney <0? Math.abs(needMoney):0;
  }
}