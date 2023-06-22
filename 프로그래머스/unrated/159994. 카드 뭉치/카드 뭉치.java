class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int c1Idx = 0;
        int c2Idx = 0;
        
        boolean isAble = true;
        for(int i =0; i< goal.length; i++) {
            if(c1Idx < cards1.length && goal[i].equals(cards1[c1Idx])) {
                c1Idx++;
            } else if(c2Idx < cards2.length && goal[i].equals(cards2[c2Idx])){
                c2Idx++;
            }else{
                isAble = false;
                break;
            }
        }
        
        return isAble?"Yes":"No";
    }
}