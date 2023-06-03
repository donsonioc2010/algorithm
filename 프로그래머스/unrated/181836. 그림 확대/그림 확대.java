class Solution {
  public String[] solution(String[] picture, int k) {
    String[] answer = new String[picture.length * k];

    int idx = 0;
    for (int i = 0; i < picture.length; i++) {
      char[] line = picture[i].toCharArray();
      StringBuffer sb = new StringBuffer();
      for (char c : line) {
        for (int cnt = 0; cnt < k; cnt++)
          sb.append(c);
      }
      for(int j = 0; j < k; j++) {
        answer[idx++] = sb.toString();
      }
    }

    return answer;
  }
}
