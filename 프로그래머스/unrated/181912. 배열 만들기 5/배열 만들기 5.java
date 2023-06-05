import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        return Arrays.stream(intStrs).filter(str -> Integer.parseInt(str.substring(s, s+l)) > k).mapToInt(str -> Integer.parseInt(str.substring(s, s+l))).toArray();
    }
}