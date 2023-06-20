import java.util.ArrayList;

class Solution {
  public String[] solution(int n, int[] arr1, int[] arr2) {
    ArrayList<String> answer = new ArrayList<>();
    for (int i = 0; i < arr1.length; i++) {
      String map1 = Integer.toBinaryString(arr1[i]);
      String map2 = Integer.toBinaryString(arr2[i]);
      int map1MoreLength = n - map1.length();
      int map2MoreLength = n - map2.length();
      map1 = "0".repeat(map1MoreLength) + map1;
      map2 = "0".repeat(map2MoreLength) + map2;

      String temp = "";
      for (int j = 0; j < n; j++) {
        if (map1.charAt(j) == '1' || map2.charAt(j) == '1') {
          temp += "#";
        } else {
          temp += " ";
        }
      }
      answer.add(temp);
    }
    return answer.stream().toArray(String[]::new);
  }
}