import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

class Solution {
  public int solution(int[] priorities, int location) {
    PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
    Queue<Integer[]> q = new LinkedList<>();
    for (int i = 0; i < priorities.length; i++) {
      q.offer(new Integer[] { i, priorities[i] });
      pq.offer(priorities[i]);
    }

    int cnt = 0;
    while (!q.isEmpty()) {
      if (pq.peek() == q.peek()[1]) {
        cnt++;
        if (location == q.peek()[0]) {
          break;
        }
        pq.poll();
        q.poll();
      } else {
        q.offer(q.poll());
      }
    }
    return cnt;
  }
}