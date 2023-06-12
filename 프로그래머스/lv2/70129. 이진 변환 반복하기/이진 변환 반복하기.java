import java.util.Arrays;

class Solution {
  public int[] solution(String s) {
    int loopCnt = 0;
    int removeZeroCnt = 0;
    while (!"1".equals(s)) {
      StringBuffer sb = new StringBuffer();
      for (int i = 0; i < s.length(); i++) {
        if (s.charAt(i) == '1') {
          sb.append("1");
        } else {
          removeZeroCnt++;
        }
      }

      int c = sb.length();
      if (c == 0) {
        sb.append("1");
      } else {
        s = Integer.toBinaryString(c);
      }

      if (sb.toString().equals("")) {
        sb.append("1");
      }
      loopCnt++;
    }
    return new int[] { loopCnt, removeZeroCnt };
  }
}