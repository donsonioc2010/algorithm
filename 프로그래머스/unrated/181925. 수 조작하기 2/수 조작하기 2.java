class Solution {
  public String solution(int[] numLog) {
    StringBuffer sb = new StringBuffer();
    for (int i = 1; i < numLog.length; i++) {
      switch (numLog[i] - numLog[i - 1]) {
        case 1:
          sb.append("w");
          break;
        case -1:
          sb.append("s");
          break;
        case 10:
          sb.append("d");
          break;
        default:
          sb.append("a");
      }
    }

    return sb.toString();
  }
}