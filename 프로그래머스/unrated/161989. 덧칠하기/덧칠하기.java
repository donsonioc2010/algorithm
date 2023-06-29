//'N'미터의 벽을 'N'개의 구역으로 나누고 1 ~ 'N'의 구역으로 이름을 지정
// 벽을 칠하는 롤러의 길이를 'M', 칠해야 하는 구역을 Section[]
class Solution {
    public int solution(int n, int m, int[] section) {
        if(m==1){
            return section.length;
        }
        
        boolean[] wall = new boolean[200000];
        //실제 칠해지는 길이 section[] + (m-1)
        
        int answer = 0;
        for(int i =0; i< section.length; i++) {
            int wallNum = section[i];
            if(!wall[wallNum]) {
                answer++;
                for(int j =wallNum; j< wallNum+m; j++){
                    wall[j] = true;
                }
            }
        }
        return answer;
    }
}