import java.util.Arrays;

class Solution {
  public static void main(String[] args) {
    System.out.println(Arrays.toString(new Solution().solution(" i    love  you")));
  }

  public String[] solution(String my_string) {
    return Arrays.stream(my_string.trim().split(" ")).filter(str -> !str.equals("")).toArray(String[]::new);
  }
}