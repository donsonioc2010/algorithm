import java.util.Arrays;

class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int gcd = getGcd(denom1, denom2);
        int boonja = ((numer1 * denom2) + (numer2 * denom1)) / gcd;
        int boonmo = (denom1 * denom2) / gcd;
        int boonjamoGcd = getGcd(boonja, boonmo);
        return boonjamoGcd == 1 ? new int[]{boonja, boonmo} : new int[]{boonja / boonjamoGcd, boonmo / boonjamoGcd};
    }

    private int getGcd(int a, int b) {
        int temp, n;
        if (b > a) {
            temp = a;
            a = b;
            b = temp;
        }
        while (b != 0) {
            n = a % b;
            a = b;
            b = n;
        }
        return a;
    }
}