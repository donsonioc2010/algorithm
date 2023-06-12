import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Solution {
  public int[] solution(int[][] score) {
    double[] avgAry = IntStream.range(0, score.length).mapToDouble(i -> (score[i][0] + score[i][1]) / 2.0).toArray();
    ArrayList<Double> rank = new ArrayList<>(Arrays.stream(avgAry).boxed().collect(Collectors.toSet()));
    rank.sort(Comparator.reverseOrder());
    int[] answer = new int[avgAry.length];

    int rankCnt = 1;
    for (int i = 0; i < rank.size(); i++) {
      int sameRank = 0;
      for (int j = 0; j < avgAry.length; j++) {
        if (rank.get(i) == avgAry[j]) {
          sameRank++;
          answer[j] = rankCnt;
        }
      }
      rankCnt += sameRank;
    }
    return answer;

  }
}