import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Solution {
    public int solution(int a, int b, int c, int d) {
        Set<Integer> dice = new HashSet<Integer>(Arrays.asList(a, b, c, d));
        List<Integer> diceSort = Arrays.asList(a, b, c, d).stream().sorted().collect(Collectors.toList());
        if (dice.size() == 1)
            return 1111 * diceSort.get(0);

        if (dice.size() == 4)
            return diceSort.get(0);

        if (dice.size() == 3) {
            List<Integer> qr = dice.stream().filter(i -> (int) IntStream.range(0, diceSort.size()).filter(j -> diceSort.get(j) == i).count() == 1).collect(Collectors.toList());
            return qr.get(0) * qr.get(1);
        }

        int threeNum = dice.stream().filter(i -> IntStream.range(0, diceSort.size()).filter(j -> diceSort.get(j) == i).count() >= 3).findFirst().orElse(-1);
        if (threeNum < 0) {
            return (diceSort.get(0) + diceSort.get(3)) * (Math.abs(diceSort.get(0) - diceSort.get(3)));
        }
        int powNum = diceSort.get(0) == threeNum ? 10 * diceSort.get(0) + diceSort.get(3) : 10 * diceSort.get(3) + diceSort.get(0);
        return (int) Math.pow(powNum, 2);
    }
}