import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr) {
        String answer = "";
        for (int num : arr) {
            for (int i = 0; i < num; i++) {
                answer += num + " ";
            }
        }
        return Arrays.stream(answer.split(" ")).mapToInt(Integer::parseInt).toArray();
    }
}