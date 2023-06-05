import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
class Solution {
    public String solution(String my_string, int m, int c) {
        List<String> subStr = new ArrayList<>();
        int cnt = my_string.length() / m;
        for (int i = 0; i < cnt; i++) {
            subStr.add(my_string.substring(0, m));
            my_string = my_string.substring(m);
        }
        return subStr.stream().map(str -> str.charAt(c - 1)+"").collect(Collectors.joining(""));
    }
}