import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * arr[i] >= 50 && arr[i]/2==0 ? arr[i]/2 : arr[i]
 * arr[i] < 50 && arr[i]/2 == 1 ? arr[i] * 2 + 1 : arr[i]
 * Arrays.copyOfRange의 경우 DeepCopy때문에 조작해도 이상 없음.
 */
class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(new int[]{1, 2, 3, 100, 99, 98}));
        ;
    }

    public int solution(int[] arr) {
        for (int cnt = 1; ; cnt++) {
            int[] temp = Arrays.copyOfRange(arr, 0, arr.length); //이전 배열
            arr = IntStream.range(0, temp.length)
                    .map(i -> {
                        if (temp[i] >= 50 && temp[i] % 2 == 0)
                            return temp[i] / 2;
                        if (temp[i] < 50 && temp[i] % 2 == 1)
                            return (temp[i] * 2) + 1;
                        return temp[i];
                    }).toArray();
            if (isSameAry(arr, temp)) {
                return cnt - 1;
            }
        }
    }

    // 배열 모두가 같은 결과값일때 True
    private boolean isSameAry(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i])
                return false;
        }
        return true;
    }

}