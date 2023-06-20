class Solution {
  public int solution(int a, int b, int n) {
    int answer = 0;
    while (n >= a) {
      int getCola = (n / a) * b;
      n = (n % a) + getCola;
      answer += getCola;
    }

    return answer;
  }
}