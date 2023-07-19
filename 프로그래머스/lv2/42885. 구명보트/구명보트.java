import java.util.Arrays;

class Solution {
  public static void main(String[] args) {
    System.out.println(new Solution().solution(new int[] { 70, 50, 80, 50 }, 100));
  }

  public int solution(int[] people, int limit) {
    Arrays.sort(people);
    int count = 0;
    int sum = 0;
    for (int weight : people) {
      if (sum + weight < limit) {
        sum += weight;
      } else if (sum + weight == limit) {
        count++;
        sum = 0;
      } else {
        count++;
        sum = weight;
      }
    }
    return sum >0 ? count + 1 : count;
  }
}