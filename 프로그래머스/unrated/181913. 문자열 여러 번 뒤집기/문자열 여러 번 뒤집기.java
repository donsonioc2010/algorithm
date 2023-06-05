class Solution {
    public String solution(String my_string, int[][] queries) {
        for (int i = 0; i < queries.length; i++) {
            int sIdx = queries[i][0];
            int eIdx = queries[i][1];
            my_string = my_string.substring(0, sIdx) + new StringBuffer(my_string.substring(sIdx, eIdx+1)).reverse() + my_string.substring(eIdx+1);
        }

        return my_string;
    }
}