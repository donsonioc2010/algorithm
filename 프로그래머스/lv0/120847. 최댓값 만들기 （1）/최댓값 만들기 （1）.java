import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int solution(int[] numbers) {
        int[] a = Arrays.stream(numbers).boxed().sorted(Collections.reverseOrder()).mapToInt(i->i).toArray();
        return a[0] * a[1];
    }
}