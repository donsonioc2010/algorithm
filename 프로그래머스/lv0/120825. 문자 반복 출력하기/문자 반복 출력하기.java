import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
  public String solution(String my_string, int n) {
    return Arrays.stream(my_string.split("")).map(str->{
      String rtn="";
      for(int i =0; i<n; i++){
        rtn += str;
      }
      return rtn;
    }).collect(Collectors.joining());
  }
}