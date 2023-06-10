//b+a b-a 9 3  4 5 6 7 8
class Solution {
  public int solution(int[] sides) {
    return Math.abs(sides[1]+sides[0]) - Math.abs(sides[1]-sides[0]) -1;
  }
}