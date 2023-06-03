class Solution {
  public String[] solution(String[] strArr) {
        for(int i =0; i < strArr.length; i++)
            strArr[i] = (i+1) % 2 == 1 ? strArr[i].toLowerCase() : strArr[i].toUpperCase();
        return strArr;
    }
}