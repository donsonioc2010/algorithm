
class Solution {
  public String solution(int n) {
    StringBuilder sb = new StringBuilder();
    boolean isAdd = true;
    while (n > 0) {
      int mod = n % 3;
      if (mod == 0) {
        mod = 4;
        n = n / 3 - 1;
      } else {
        n = n / 3;
      }
      sb.insert(0, Integer.toString(mod));
    }
    System.out.println(sb);

    return sb.toString();
  }
}
