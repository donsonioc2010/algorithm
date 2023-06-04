import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/**
 * n = 1 : num_list의 0번 인덱스부터 b번 인덱스까지
 * n = 2 : num_list의 a번 인덱스부터 마지막 인덱스까지
 * n = 3 : num_list의 a번 인덱스부터 b번 인덱스까지
 * n = 4 : num_list의 a번 인덱스부터 b번 인덱스까지 c 간격으로
 */

class Solution {
  public int[] solution(int n, int[] slicer, int[] num_list) {
    if (n == 1)
      return Arrays.copyOfRange(num_list, 0, slicer[1] + 1);
    if (n == 2)
      return Arrays.copyOfRange(num_list, slicer[0], num_list.length);
    if (n == 3)
      return Arrays.copyOfRange(num_list, slicer[0], slicer[1] + 1);

    List<Integer> list = new ArrayList<>();
    for (int i = slicer[0]; i <= slicer[1]; i += slicer[2]) {
      list.add(num_list[i]);
    }

    return list.stream().mapToInt(num -> num).toArray();
  
  }
}