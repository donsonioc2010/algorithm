import java.util.HashMap;
import java.util.Map;

class Solution {
  public String solution(String X, String Y) {
    Map<Integer, Integer> xmap = new HashMap<>();
    Map<Integer, Integer> ymap = new HashMap<>();
    Map<Integer, Integer> common = new HashMap<>();

    // 초기화
    for (int i = 0; i <= 9; i++) {
      xmap.put(i, 0);
      ymap.put(i, 0);
      common.put(i, 0);
    }

    // x, y 포함된 숫자 확인
    for (int i = 0; i < X.length(); i++) {
      int num = X.charAt(i) - '0';
      xmap.put(num, xmap.get(num) + 1);
    }

    for (int i = 0; i < Y.length(); i++) {
      int num = Y.charAt(i) - '0';
      ymap.put(num, ymap.get(num) + 1);
    }

    // 공통 갯수 확인
    boolean isAllZero = true;
    for (int i = 0; i <= 9; i++) {
      int min = Math.min(xmap.get(i), ymap.get(i));
      common.put(i, Math.min(xmap.get(i), ymap.get(i)));
      if (i > 0 && min > 0 && isAllZero) {
        isAllZero = false;
      }
    }

    if (isAllZero) {
      if (common.get(0) == 0) {
        return "-1";
      } else {
        return "0";
      }
    }
    StringBuilder sb = new StringBuilder();

    for (int i = 9; i >= 0; i--) {
      sb.append(String.valueOf(i).repeat(common.get(i)));
    }

    return sb.toString();
  }
}