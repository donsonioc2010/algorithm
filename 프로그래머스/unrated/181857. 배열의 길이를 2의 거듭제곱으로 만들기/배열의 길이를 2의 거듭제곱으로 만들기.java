import java.util.stream.IntStream;
class Solution {
    public int[] solution(int[] arr) {
        int nearPowVal = getNearPow(arr.length, 2);
        return nearPowVal == arr.length || arr.length==1 ? arr : IntStream.range(0, nearPowVal).map(i -> i < arr.length ? arr[i] : 0).toArray();
    }

    private int getNearPow(int num, int powVal) {
        if (powVal >= num)
            return powVal == num ? num : powVal;
        return getNearPow(num, powVal * 2);
    }
}