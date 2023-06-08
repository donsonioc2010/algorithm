import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Solution {
  public String solution(String phone_number) {
    return IntStream.range(0, phone_number.length()).mapToObj(i->{
      if(i <phone_number.length() -4)
        return "*";
      return String.valueOf(phone_number.charAt(i));
    }).collect(Collectors.joining());
  }
}