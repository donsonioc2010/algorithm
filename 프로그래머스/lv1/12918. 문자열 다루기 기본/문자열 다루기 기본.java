class Solution {
  public boolean solution(String s) {
    return (s.length() == 4 || s.length() == 6)
        && !(s.chars().filter(i -> !(i >= '0' && i <= '9')).findFirst().isPresent());
  }
}