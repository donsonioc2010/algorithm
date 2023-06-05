import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();

        for (; ; ) {
            list.add(n);
            if (n <= 1) break;
            if (n % 2 == 0)
                n /= 2;
            else n = n * 3 + 1;
        }

        return list.stream().mapToInt(i->i).toArray();
    }
}