import java.util.Scanner;
import java.util.Arrays;

public class Main {
    private static int squareWidth = 10;    // 사각형 한변길이
    private static int squreArea = 100;     // 사각형 넓이
	public static void main(String[] args) throws Exception{
		 Scanner sc = new Scanner(System.in);

        int count = 0;

        boolean[][] area = new boolean[squreArea][squreArea]; //앞x 뒤y

        for(int i = 0; i <squareWidth; i++){
            Arrays.fill(area[i],false);
        }

        int colorPaperNum = sc.nextInt();

        if(colorPaperNum <= 100){       //100개 이하 validation
            for(int i = 0; i < colorPaperNum; i++){
                int num1 = sc.nextInt(); // 종이의 왼쪽 변과 도화지의 왼쪽 변 사이의 거리
                int num2 = sc.nextInt(); // 색종이의 아래쪽 변과 도화지의 아래쪽 변 사이의 거리

                for(int x = num1; x < num1 + squareWidth; x++){
                    for(int y = num2; y < num2+squareWidth; y++){
                        if(!area[x][y]){
                            area[x][y] = true;
                            count++;
                        }
                    }
                }
            }
            System.out.println(count);
        }
	}
}
