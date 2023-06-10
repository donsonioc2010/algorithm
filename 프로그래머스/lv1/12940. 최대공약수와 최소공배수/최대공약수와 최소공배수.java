class Solution {
    public int[] solution(int n, int m) {
        int gcd = gcd(n,m);
        return new int[]{gcd, ((n*m)/gcd)};        
    }
    
    private static int gcd(int n1, int n2){
        int mod = n1 % n2;
        return mod == 0 ? n2 : gcd(n2 , mod);
    }
}