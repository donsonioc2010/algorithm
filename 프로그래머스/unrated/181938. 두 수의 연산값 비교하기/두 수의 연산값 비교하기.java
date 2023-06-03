class Solution {
    public int solution(int a, int b) {
        int num1 = 2 * a * b;
        int num2 = Integer.parseInt(Integer.toString(a)+Integer.toString(b));
        return num1 < num2? num2:num1;
    }
}