import java.util.LinkedList;
import java.util.Queue;

class Solution {
  public static void main(String[] args) {
    System.out.println(new Solution().solution(2, 10, new int[] { 7, 4, 5, 6 }));
    System.out.println(new Solution().solution(100, 100, new int[] { 10 }));
    System.out.println(new Solution().solution(100, 100, new int[] { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 }));
  }

  public int solution(int bridge_length, int weight, int[] truck_weights) {
    // [0] Weight, [1] Time
    Queue<Integer[]> q = new LinkedList<>();
    q.offer(new Integer[] { truck_weights[0], bridge_length - 1 });
    int idx = 1;
    int time = 1;
    while (!q.isEmpty() || idx < truck_weights.length) {
      int qWeight = q.stream().mapToInt(v -> v[0]).sum();
      if (idx < truck_weights.length) {
        int sumQAndNextWeight = qWeight + truck_weights[idx];
        if (sumQAndNextWeight <= weight) {
          q.offer(new Integer[] { truck_weights[idx++], bridge_length });
        }
      }
      for (int i = 0; i < q.size(); i++) {
        Integer[] temp = q.poll();
        temp[1]--;
        q.offer(temp);
      }
      if (q.peek()[1] == 0)
        q.poll();
      time++;
    }
    return time + 1;
  }
}