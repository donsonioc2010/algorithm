import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

class Solution {
  public int solution(int[] people, int limit) {
    Arrays.sort(people);
    Deque<Integer> deque = new LinkedList<>(Arrays.asList(Arrays.stream(people).boxed().toArray(Integer[]::new)));

    int count = 0;
    while (!deque.isEmpty()) {
      if (deque.getLast() + deque.getFirst() > limit) {
        deque.pollLast();
      } else {
        deque.pollLast();
        deque.pollFirst();
      }
      count++;
    }
    return count;
  }
}