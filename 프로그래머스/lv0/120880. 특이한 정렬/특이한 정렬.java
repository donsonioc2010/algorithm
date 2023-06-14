import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

class Solution {
  public int[] solution(int[] numlist, int n) {
    List<Integer> byListToNumList = Arrays.stream(numlist).boxed().collect(Collectors.toList());
    Set<Integer> numSet = new TreeSet<>();
    List<Integer> answer = new ArrayList<>();

    byListToNumList.stream().forEach(i -> numSet.add(Math.abs(i - n)));

    for (Integer mod : numSet) {
      if(mod==0){
        answer.add(n);
        continue;
      }
      if (byListToNumList.contains(n + mod)) 
        answer.add(n + mod);
      if (byListToNumList.contains(n - mod)) 
        answer.add(n - mod);
      
    }
    return answer.stream().mapToInt(Integer::intValue).toArray();
  }
}