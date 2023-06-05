import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Solution {
    public String solution(String my_string, int[] indices) {
        Set<Integer> keys = new HashSet<>(Arrays.stream(indices).boxed().collect(Collectors.toSet()));
        return IntStream.range(0, my_string.length())
                .filter(i -> !keys.contains(i))
                .mapToObj(i -> my_string.charAt(i) + "")
                .collect(Collectors.joining());
    }
}