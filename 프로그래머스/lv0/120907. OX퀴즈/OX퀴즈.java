import java.util.stream.IntStream;

class Solution {
  public String[] solution(String[] quiz) {
    return IntStream.range(0, quiz.length).mapToObj(qidx -> {
      String[] split = quiz[qidx].split(" ");
      int n1 = Integer.parseInt(split[0]);
      int n2 = Integer.parseInt(split[2]);
      int n3 = Integer.parseInt(split[4]);

      if (split[1].equals("+")) {
        return n1 + n2 == n3 ? "O" : "X";
      } else {
        return n1 - n2 == n3 ? "O" : "X";
      }
    }).toArray(String[]::new);
  }
}