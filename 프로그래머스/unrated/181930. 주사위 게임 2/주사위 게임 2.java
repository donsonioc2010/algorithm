class Solution {
    public int solution(int a, int b, int c) {
        int cnt = getCnt(a,b,c);
        if(cnt == 0)
            return addNum(a,b,c);
        if(cnt == 1)
            return addNum(a,b,c) * powSum(a,b,c,2);
        return addNum(a,b,c) * powSum(a,b,c,2) * powSum(a,b,c,3);
    }
    private int addNum(int a, int b, int c) {
        return a+b+c;
    }
    private int powSum(int a, int b, int c, int powNum) {
        return (int)(Math.pow(a,powNum) + Math.pow(b,powNum) + Math.pow(c,powNum));
    }
    
    private int getCnt(int a, int b, int c) {
        int cnt = 0;
        if(a == b)
            cnt++;
        if(a == c)
            cnt++;
        if(b == c)
            cnt++;
        return cnt;
    }
}