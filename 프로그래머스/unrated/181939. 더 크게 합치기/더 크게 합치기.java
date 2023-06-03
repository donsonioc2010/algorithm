class Solution {
    public int solution(int a, int b) {
        int num1 = Integer.parseInt(b+""+a);
        int num2 = Integer.parseInt(a+""+b);
        return num1 < num2 ? num2:num1;
    }
}