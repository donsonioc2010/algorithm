import java.util.stream.IntStream;

class Solution {
  public String solution(String[] id_pw, String[][] db) {
    int max = IntStream.range(0, db.length).map(i -> db[i][0].equals(id_pw[0]) && db[i][1].equals(id_pw[1]) ? 2
        : db[i][0].equals(id_pw[0]) && !db[i][1].equals(id_pw[1]) ? 1 : 0).max().orElse(-1);
    return max == 2 ? "login" : max == 1 ? "wrong pw" : "fail";
  }
}