import java.util.HashSet;
import java.util.Set;

class Solution {
  public int[] solution(int n, String[] words) {
    Set<String> containMap = new HashSet<>();
    int cnt = 0;
    int wordIdx = 0;
    while (true) {
      cnt++;
      for (int i = 1; i <= n; i++) {
        if (wordIdx == 0) {
          containMap.add(words[wordIdx++]);
        } else {
          String afterWord = words[wordIdx - 1];
          if (wordIdx >= words.length) {
            return new int[] { 0, 0 };
          } else if (containMap.contains(words[wordIdx]) ||
              afterWord.charAt(afterWord.length() - 1) != words[wordIdx].charAt(0)) {
            return new int[] { i, cnt };
          } else {
            containMap.add(words[wordIdx]);
            wordIdx++;
          }
        }
      }
    }

  }
}