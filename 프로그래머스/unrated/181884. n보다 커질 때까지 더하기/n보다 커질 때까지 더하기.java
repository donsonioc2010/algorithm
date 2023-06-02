class Solution {
    public int solution(int[] numbers, int n) {
        int answer = 0;
        for(int num : numbers) {
            if((answer += num) > n){
                break;
            }
        }
        return answer;
    }
}