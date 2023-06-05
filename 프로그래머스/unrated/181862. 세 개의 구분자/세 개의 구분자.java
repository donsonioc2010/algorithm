import java.util.Arrays;

class Solution {
    public String[] solution(String myStr) {
        String[] rtnAry = Arrays.stream(myStr.replaceAll("[abc]", " ").trim().split(" ")).filter(s -> !"".equals(s)).toArray(String[]::new);
        return rtnAry.length == 0 ? new String[]{"EMPTY"} : rtnAry;
    }
}