class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        StringBuffer even = new StringBuffer(); //짝수
        StringBuffer odd = new StringBuffer(); //홀수
        
        for(int num : num_list) 
            if(num % 2 == 1)
                odd.append(num + "");
            else
                even.append(num + "");
        return Integer.parseInt(even.toString()) + Integer.parseInt(odd.toString());
    }
}