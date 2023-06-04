import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Solution {
    public int solution(int[] array) {
        if (array.length == 0)
            return -1;
        if (array.length == 1)
            return array[0];
        Set<Integer> list = Arrays.stream(array).boxed().collect(Collectors.toSet());
        Map<Integer, Integer> cntList = new HashMap<>();
        // array 길이는 100
        list.stream().forEach(key ->
                cntList.put(key, (int) IntStream.range(0, array.length).filter(num -> key == array[num]).count()));

        if (cntList.size() == 1)
            return array[0];

        int maxVal = Integer.MIN_VALUE;
        int maxValKey = 0;
        for (Integer key : list) {
            if (maxVal < cntList.get(key)) {
                maxValKey = key;
                maxVal = cntList.get(key);
            }
        }
        int finalMaxVal = maxVal;
        System.out.println(cntList.values().stream().filter(num -> finalMaxVal == num).count());
        return cntList.values().stream().filter(num -> finalMaxVal == num).count() > 1? -1 :  maxValKey;
    }
}