class Solution {
    public int[] solution(int n, int k) {
        int[] answer = new int[n/k];
        
        int value = k;
        for(int i =0; i < answer.length; i++) {
            answer[i] = value;
            value+=k;
        }
        
        return answer;
    }
}