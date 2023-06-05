import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int l, int r) {
        List<Integer> requestList = new ArrayList<>();

        for(int i = l; i <= r; i++) {
            String num = Integer.toString(i);
            num = num.replace("5", "");
            num = num.replace("0", "");
            if(num.equals(""))
                requestList.add(i);
        }
        return requestList.size()==0? new int[]{-1} : requestList.stream().mapToInt(i->i).toArray();
    }
}