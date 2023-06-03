import java.util.Arrays;

class Solution {
    public int solution(int[] num_list) {
        if(num_list.length >= 11) {
            return Arrays.stream(num_list).sum();
        }
        int multi = num_list[0];
        for (int i = 1; i < num_list.length; i++) {
            multi *= num_list[i];
        }
        return multi;
    }
}