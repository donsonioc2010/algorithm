import java.util.*;
class Solution {
    private String target = null;
    private int count = 0;
    
    public int solution(String begin, String target, String[] words) {
        boolean[] visited = new boolean[words.length];
        int count = 0;
        
        boolean isAble = false;
        for(String word : words) {
            if(word.equals(target)) {
                isAble = true;
            }
        }
        if(!isAble) {
            return 0;
        }
        
        for(int j = 0; j< words.length; j++) {
            String temp = words[j];
            int wordWrongCnt = 0;
            for(int i =0; i< begin.length(); i++) {
                //temp.replaceFirst(String.valueOf(begin.charAt(i)), "");
                wordWrongCnt = temp.charAt(i) != begin.charAt(i) ? wordWrongCnt+1 : wordWrongCnt;
            }
            //if(temp.length()<=1) {
            if(wordWrongCnt==1) {
                Queue<Integer> q = new LinkedList<>();
                q.offer(j);
                visited[j] = true;
                while(!q.isEmpty()) {
                    Integer idx = q.poll();
                    begin = words[idx];
                    count++;
                    if(begin.equals(target)){
                        return count;                        
                    }
                    String qTemp = null;
                    for(int k = 0; k< words.length; k++){
                        if(visited[k]) continue;
                        qTemp = words[k];
                        int qWordWrongCnt = 0;
                        for(int i =0; i< begin.length(); i++) {
                            //qTemp.replaceFirst(String.valueOf(begin.charAt(i)), "");
                            qWordWrongCnt = qTemp.charAt(i) != begin.charAt(i) ? qWordWrongCnt+1 : qWordWrongCnt;
                        }
                        //if(temp.length>=2) continue;
                        if(qWordWrongCnt==1) {
                            System.out.println(qTemp);
                            q.offer(k);    
                            visited[k] = true;
                         }
                    }
                }
            }
        }
        
        int answer = 999;
        return answer;
    }
    
    private void dfs(int idx) {
        
    }
}