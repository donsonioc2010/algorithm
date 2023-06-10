class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {};
        int xSize = board[0]/2, ySize = board[1]/2;
        int x = 0, y = 0;

        for(String cmd : keyinput){
            if("up".equals(cmd) && y <ySize)
                y++;
            else if("down".equals(cmd) && y >(ySize*-1))
                y--;
            else if("left".equals(cmd) && x >(xSize *-1))
                x--;
            else if("right".equals(cmd) && x <xSize)
                x++;
        }
        return new int[]{x , y};
    }
}