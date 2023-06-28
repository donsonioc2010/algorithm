import java.util.Arrays;

class Solution {
  public static void main(String[] args) {
    new Solution().solution("1S2D*3T"); // 37
    new Solution().solution("1D2S#10S"); // 9
    new Solution().solution("1S*2T*3S"); // 23
    new Solution().solution("1D#2S*3S"); // 5
    new Solution().solution("1D2S3T*"); // 59
  }

  public int solution(String dartResult) {
    String[] strAry = dartResult.replace("*", " * ")
        .replace("#", " # ")
        .replace("S", "S ")
        .replace("D", "D ")
        .replace("T", "T ")
        .replace("  ", " ")
        .split(" ");

    for (int i = 0; i < strAry.length; i++) {
      if (strAry[i].contains("S")) {
        strAry[i] = strAry[i].replace("S", "");
      } else if (strAry[i].contains("D")) {
        strAry[i] = String.valueOf((int) Math.pow(Integer.parseInt(strAry[i].replace("D", "")), 2));
      } else if (strAry[i].contains("T")) {
        strAry[i] = String.valueOf((int) Math.pow(Integer.parseInt(strAry[i].replace("T", "")), 3));
      }
    }
    int numIdx = 0;
    for (int i = 0; i < strAry.length; i++) {
      String tempIStr = strAry[i].trim();
      if (tempIStr.contains("#")) {
        strAry[i - 1] = String.valueOf(Integer.parseInt(strAry[i - 1]) * -1);
      }
      if (tempIStr.contains("*")) {
        int tempNumIdx = 0;
        for (int j = 0; j < i; j++) {
          if ("#".equals(strAry[j].trim()) || "*".equals(strAry[j].trim())) {
            continue;
          }
          tempNumIdx++;
          if ("*".equals(tempIStr) && (tempNumIdx == numIdx - 1 || tempNumIdx == numIdx)) {
            strAry[j] = String.valueOf(Integer.parseInt(strAry[j]) * 2);
          }
        }
      }
      if (!"#".equals(tempIStr) && !"*".equals(tempIStr)) {
        numIdx++;
      }
    }

    int answer = 0;
    for (int i = 0; i < strAry.length; i++) {
      if ("#".equals(strAry[i]) || "*".equals(strAry[i])) {
        continue;
      }
      answer += Integer.parseInt(strAry[i]);
    }

    return answer;
  }
}