import java.util.Arrays;

class Solution {
  public int solution(int[] A, int[] B) {
    A = Arrays.stream(A).sorted().toArray();
    B = Arrays.stream(B).sorted().toArray();
    int sum = 0;
    for(int i =0 ; i<A.length; i++) 
      sum += A[i] * B[B.length - 1 - i];
    
    return sum;
  }
}