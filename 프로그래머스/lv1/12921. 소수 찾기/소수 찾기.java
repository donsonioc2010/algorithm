class Solution {
    public int solution(int n) {
        if(n == 2){
            return 1;
        }
        int cnt = 1;
        for(int i =3; i<=n; i=i+2){
            if(i >3 && i%3==0)
                continue;
            boolean isPrime = true;
            for(int j = 3; j<=(int)Math.sqrt(i); j=j+2){
                if(i%j==0 && i != j){
                    isPrime=false;
                    break;
                }
            }
            cnt = isPrime? cnt+1: cnt;
        }
        
        return cnt;
    }
}