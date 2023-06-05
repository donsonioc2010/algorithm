class Solution {
    public int solution(String myString, String pat) {
        int cnt = 0;
        int strLength = myString.length();
        for (int i = 0; i < strLength; i++) {
            if (myString.startsWith(pat)) {
                cnt++;
            }
            myString = myString.substring(1);
        }
        return cnt;
    }
}