
class Solution {
  public int solution(int[][] lines) {
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < lines.length; i++) {
      min = Math.min(min, lines[i][0]);
      max = Math.max(max, lines[i][1]);
    }

    int[] aryCnt = new int[(min < 0 ? max + Math.abs(min) : max+1)];
    int addIdx = min < 0 ? Math.abs(min) : 0;
    for (int i = 0; i < lines.length; i++)
      for (int j = lines[i][0] ; j < lines[i][1] ; j++)
        aryCnt[j+addIdx]++;

    int cnt = 0;
    for (int i = 0; i < aryCnt.length; i++)
      if (aryCnt[i] > 1)
        cnt++;

    return cnt;
  }
}