import java.util.Arrays;

class Solution {
  public int[] solution(String myString) {
    if (myString.charAt(myString.length() - 1) == 'x') {
      myString += " ";
    }
    String[] ary = myString.split("x");
    ary[ary.length - 1] = ary[ary.length - 1].equals(" ") ? "" : ary[ary.length - 1];
    return Arrays.stream(ary).mapToInt(str -> str.length()).toArray();
  }
}