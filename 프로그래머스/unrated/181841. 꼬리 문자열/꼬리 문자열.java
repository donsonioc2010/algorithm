import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
  public static void main(String[] args) {
    System.out.println(new Solution().solution(new String[] { "abc", "def", "ghi" }, "ef"));
  }

  public String solution(String[] str_list, String ex) {
    return String.join("", Arrays.stream(str_list).filter(str -> !str.contains(ex)).collect(Collectors.toList()));
  }
}