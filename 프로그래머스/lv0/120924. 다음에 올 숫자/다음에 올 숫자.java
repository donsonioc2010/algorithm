class Solution {
    // common.length==3이상이다.
  public int solution(int[] common) {
    if(common[common.length -2]-common[common.length -3]==common[common.length -1]-common[common.length -2]){
        return common[common.length-1] + (common[common.length -2]-common[common.length -3]);
    }
    return common[common.length-1] * (common[2]/common[1]);
  }
}