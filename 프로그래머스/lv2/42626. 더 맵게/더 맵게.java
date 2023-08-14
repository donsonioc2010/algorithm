import java.util.PriorityQueue;

class Solution {
  public static void main(String[] args) {
    System.out.println(new Solution().solution(new int[] { 1, 2, 3, 9, 10, 12 }, 7));
  }

  public int solution(int[] scoville, int K) {
    PriorityQueue<Integer> list = new PriorityQueue<>();
    for (int num : scoville)
      list.offer(num);

    int count = 0;

    while (list.peek() < K) {
      if (list.size() < 2) {
        break;
      }
      count++;
      Integer firstMin = list.poll();
      Integer secondMin = list.poll();
      list.offer(firstMin + (secondMin*2));
    }

    return list.peek() < K && list.size()==1 ? -1 : count;
  }
}