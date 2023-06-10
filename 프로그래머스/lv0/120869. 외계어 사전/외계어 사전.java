class Solution {
  // spell을 모두 사용해야 한다.
  public int solution(String[] spell, String[] dic) {
    int cnt = 0;

    for (String word : dic) {
      boolean isAllContains = true;
      boolean isInLoop = true;
      for (int j = 0; isInLoop && j < spell.length; j++) {
        if (!word.contains(spell[j])) {
          isAllContains = false;
          isInLoop = false;
        }
      }
      if (isAllContains)
        cnt++;
    }
    return cnt != 0 ? 1 : 2;
  }
}