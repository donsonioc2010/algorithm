
class Solution {
  public int solution(String A, String B) {
    if (B.equals(A))
      return 0;
    int cnt = 1;

    for (int i = 0; i < A.length(); i++) {
      // 0부터 A.length-1
      A = A.substring(A.length() - 1) + A.substring(0, A.length() - 1);
      if (A.equals(B)) {
        break;
      } else {
        cnt++;
      }
    }
    return cnt == A.length()+1 ? -1 : cnt;
  }
}