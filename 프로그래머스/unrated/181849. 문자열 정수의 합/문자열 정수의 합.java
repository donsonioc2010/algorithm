class Solution {
  public int solution(String num_str) {
    char[] cAry = num_str.toCharArray();
    int sum = 0;
    
    for(char c : cAry) {
      sum += c-48;
    }
    return sum;
  }
}