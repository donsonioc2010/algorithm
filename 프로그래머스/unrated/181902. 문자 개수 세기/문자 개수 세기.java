// 'A'의 시작 0 , 'a'26

import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
        int[] rtnAry = new int[52];
        Arrays.fill(rtnAry, 0);
        new StringBuffer(my_string).chars().forEach(c -> {
            if (c >= 'A' && c <= 'Z')
                rtnAry[c - 65]++;
            else
                rtnAry[c - 71]++;
        });
        return rtnAry;
    }
}