import java.util.Arrays;
import java.util.Collections;

class Solution {
    public String[] solution(String myString) {
        return Arrays.stream(myString.split("x")).filter(str -> !str.equals("")).sorted().toArray(String[]::new);
    }
}