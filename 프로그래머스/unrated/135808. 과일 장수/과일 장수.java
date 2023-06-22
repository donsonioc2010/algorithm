import java.util.Arrays;
import java.util.Comparator;

class Solution {
  public int solution(int k, int m, int[] score) {
    int listCnt = score.length / m;
    score = Arrays.stream(score).boxed().sorted(Comparator.reverseOrder()).mapToInt(i -> i).toArray();
    int answer = 0;

    for (int i = 0; i < listCnt; i++) 
      answer += Arrays.stream(Arrays.copyOfRange(score, (i * m), ((i * m) + m))).min().orElse(-1) * m;
    
    return answer;
  }
}