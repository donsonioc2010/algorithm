/**
 * "ProgrammerS123" 11 "ProgrammerS"
 * "He110W0r1d" 5 "He110"
 */

class Solution {
  public static void main(String[] args) {
    System.out.println(new Solution().solution("ProgrammerS123", 11));
  }

  public String solution(String my_string, int n) {
    return my_string.substring(0, n);
  }
}