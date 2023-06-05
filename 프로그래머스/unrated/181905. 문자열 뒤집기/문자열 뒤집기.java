class Solution {
        public String solution(String my_string, int s, int e) {
        return e == my_string.length() ?
                my_string.substring(0, s) + new StringBuffer(my_string.substring(s)).reverse().toString() :
                my_string.substring(0, s) + new StringBuffer(my_string.substring(s, e + 1)).reverse().toString() + my_string.substring(e + 1);
    }
}