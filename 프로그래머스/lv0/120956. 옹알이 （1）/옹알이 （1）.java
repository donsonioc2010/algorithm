import java.util.HashSet;
import java.util.Set;

class Solution {
  public int solution(String[] babbling) {
    Set<String> maps = new HashSet<>() {
      {
        add("aya");
        add("ye");
        add("woo");
        add("ma");
      }
    };
    int cnt = 0;
    for (String str : babbling) {
      if ("".equals(str.trim()))
        continue;
      for (String key : maps)
        str = str.replace(key, " ");

      if ("".equals(str.trim()))
        cnt++;
    }
    return cnt;
  }
}