class Solution {
  public int target;
  public int[] numbers;

  public int solution(int[] numbers, int target) {
    this.numbers = numbers;
    this.target = target;
    return dfs(0, 0);
  }

  public int dfs(int depth, int sum) {
    int mathCount = 0;
    if (depth == numbers.length) {
      return sum == target ? 1 : 0;
    }

    mathCount += dfs(depth + 1, sum + numbers[depth]);
    mathCount += dfs(depth + 1, sum - numbers[depth]);
    return mathCount;
  }
}
