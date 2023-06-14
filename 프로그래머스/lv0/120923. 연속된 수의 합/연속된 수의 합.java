class Solution {
    public int[] solution(int num, int total) {
        if(num==1 && total == 0)
            return new int[]{0};
        
        int[] answer = new int[num];
        int idx = 0;
        for(int i = -100; idx==0 && i<=1000; i++) {
            int tempTotal = 0;
            int numCnt = 0;
            for(int j = i; j<=1000; j++){
                tempTotal += j;
                numCnt++;
                
                if(numCnt >num || tempTotal >total){
                    break;
                }
            
                if(numCnt == num && tempTotal == total) {
                    idx = j;
                    break;
                }
            }

        }
        for(int i = num-1; i>=0; i--){
            answer[i] = idx--;
        }
        
        
        return answer;
    }
}