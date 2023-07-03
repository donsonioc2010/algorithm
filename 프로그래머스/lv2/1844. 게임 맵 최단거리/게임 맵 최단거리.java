import java.util.Queue;
import java.util.LinkedList;
import java.util.Arrays;

class Solution {
    private int[] dx = {-1,1,0,0};
    private int[] dy = {0,0,-1,1};

    public int solution(int[][] maps) {
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{0,0});
        
        while(!q.isEmpty()) {
            int[] now = q.poll();
            int nx = now[0];
            int ny = now[1];
            
            for(int i =0; i < dx.length; i++) {
                int tx = nx + dx[i];
                int ty = ny + dy[i];

                if(tx < 0 || ty < 0 || tx >=maps.length || ty >= maps[0].length)
                    continue;
                
                if((tx == 0 && ty == 0 ) || maps[tx][ty] != 1) 
                    continue;
                
                maps[tx][ty] = maps[nx][ny]+1;
                q.offer(new int[]{tx, ty});
            }
        }
        
        for(int i =0; i< maps.length; i++) {
            System.out.println(Arrays.toString(maps[i]));
        }
        int answer = maps[maps.length-1][maps[0].length -1];
        return answer==1? -1 : answer;
    }
}