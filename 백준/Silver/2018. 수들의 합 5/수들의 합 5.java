import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int startIndex = 1, endIndex = 1, sum = 1, answer = 1;

    while (endIndex != N) {
      if (sum == N) {
        answer++;
        endIndex++;
        sum += endIndex;
      } else if (sum > N) {
        sum -= startIndex;
        startIndex++;
      } else {
        endIndex++;
        sum += endIndex;
      }
    }

    System.out.println(answer);
  }
}
