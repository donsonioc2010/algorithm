import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] num_list) {
        int numLength = num_list.length;
        boolean isOdd = numLength % 2 == 1;
        IntStream.range(1, numLength / 2+1).forEach(
                i -> {
                    int temp = num_list[i - 1];
                    num_list[i - 1] = num_list[numLength - i];
                    num_list[numLength - i] = temp;
                });
        return num_list;
    }
}