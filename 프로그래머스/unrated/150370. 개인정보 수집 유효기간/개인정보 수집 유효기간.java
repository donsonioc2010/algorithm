import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
  public int[] solution(String today, String[] terms, String[] privacies) {
    String[] todaySplit = today.split("[.]");
    Map<String, Integer> privateMonthMap = new HashMap<>();
    List<Integer> answer = new ArrayList<Integer>();

    LocalDate todayDate = LocalDate.of(
        Integer.parseInt(todaySplit[0]),
        Integer.parseInt(todaySplit[1]),
        Integer.parseInt(todaySplit[2]));

    for (int i = 0; i < terms.length; i++) {
      String[] temp = terms[i].split(" ");
      privateMonthMap.put(temp[0], Integer.parseInt(temp[1]));
    }

    for (int i = 0; i < privacies.length; i++) {
      String[] getDateAndTerms = privacies[i].split(" ");
      String[] getDate = getDateAndTerms[0].split("[.]");

      LocalDate privaciesDelDate = LocalDate.of(
          Integer.parseInt(getDate[0]),
          Integer.parseInt(getDate[1]),
          Integer.parseInt(getDate[2]));

      privaciesDelDate = privaciesDelDate.plusMonths(privateMonthMap.get(getDateAndTerms[1]));

      if (todayDate.isEqual(privaciesDelDate) || todayDate.isAfter(privaciesDelDate)) {
        answer.add(i + 1);
      }
    }

    return answer.stream().mapToInt(i -> i).toArray();
  }
}