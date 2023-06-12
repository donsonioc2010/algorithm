class Solution {
  public int solution(int n) {
    int count = 1;
    int answer = 1;
    while (true) {
      if (!String.valueOf(answer).contains("3") && answer % 3 != 0) {
        count++;
        if (count == n + 1)
          break;
      }
      answer++;
    }
    return answer;
  }
}