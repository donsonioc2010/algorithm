class Solution {
    public int solution(int chicken) { 
        if(chicken < 10){
            return 0;
        }
        int answer = 0;
        while(true){
            answer += chicken /10;
            chicken = chicken / 10 + chicken %10;
            if(chicken < 10){
                return answer ;
            }
        }
    }
}