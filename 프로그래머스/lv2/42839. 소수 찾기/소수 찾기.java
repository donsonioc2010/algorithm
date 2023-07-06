import java.util.*;

class Solution {

  Set<Integer> set = new HashSet<>();

  public int solution(String numbers) {

    recursive("", numbers);
    return (int) set.stream().filter(num -> isPrime(num)).count();
  }

  private void recursive(String comb, String others) {
    if (!comb.equals("")) {
      set.add(Integer.parseInt(comb));
    }
    for (int i = 0; i < others.length(); i++) {
      recursive(comb + others.charAt(i), others.substring(0, i) + others.substring(i + 1));
    }
  }

  private boolean isPrime(int num) {
    if (num <= 1) {
      return false;
    }
    for (int i = 2; i * i <= num; i++) {
      if (num % i == 0) {
        return false;
      }
    }

    return true;
  }
}