import java.util.Arrays;

class Solution {
    public int solution(int[] num_list) {
        int multi = num_list[0];
        for (int i = 1; i < num_list.length; i++) {
            multi *= num_list[i];
        }
        return multi < (int)Math.pow(Arrays.stream(num_list).sum(), 2) ? 1 : 0;
    }
}