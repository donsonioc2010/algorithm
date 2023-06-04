class Solution {
    public String solution(String code) {
        StringBuffer sb = new StringBuffer();
        boolean mode = false; //모드 = 0, true =1
        for(int i =0; i< code.length(); i++) {
            char c = code.charAt(i);
            
            if (c != '1') {
                sb.append(!mode && i % 2 == 0 ? c : "");
                sb.append(mode && i % 2 == 1 ? c : "");
            }
            if (c == '1'){
                mode = mode ? false:true;
            }
            
        }
        return sb.toString().equals("") ? "EMPTY" : sb.toString();
    }
}