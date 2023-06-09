class Solution {
  public int solution(int n) {
    StringBuffer sb = new StringBuffer();
    int cnt = 0;
    int sum = 0;

    while (true) {
      if (n < 3) {
        sb.append(n);
        break;
      } else {
        sb.append(n % 3);
        n /= 3;
      }
    }
    for (int i = sb.length() - 1; i >= 0; i--) {
      int num = sb.charAt(i) - '0';
        if(cnt==0){
            sum += num;
            cnt++;
        }else{
            sum +=  (num * (int) Math.pow(3, cnt++));
        }
    }
    return sum;
  }
}