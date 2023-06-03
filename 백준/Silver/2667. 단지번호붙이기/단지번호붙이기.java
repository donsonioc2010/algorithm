import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static int[] searchX = {0, 0, 1, -1};
    private static int[] searchY = {1, -1 , 0, 0};
    private static int[] houseAreaAry = new int[25 * 25];//집 크기들

    final static int MIN_LENGTH = 5;    // 최소치
    final static int MAX_LENGTH = 25;   // 최대치

    static int mapLength;               // 맵 크기
    static int totalHouseCnt = 0;       // 집의 총 갯수

    static int[][] mapAry;             // 지도
    static boolean[][] visited;         // 방문 이력
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        mapLength = sc.nextInt();

        /* Validation */
        if(mapLength < MIN_LENGTH || mapLength > MAX_LENGTH) {
            return;
        }

        /* Map Init And BufferedReader Close*/
        makeMap();
        doRun();
        resultPrint();
    }

    private static void doRun() {
        for(int i = 0; i < mapLength; i++) { // == x
            for(int j = 0; j < mapLength; j++) { // == y
                // [i][j]에 집이있고 방문을 안했을 때
                if(mapAry[i][j] != 0 && !visited[i][j]) {
                    areaSearch(i, j);
                    totalHouseCnt++;
                }
            }
        }
    }

    /* 영역 조사 dfs */
    private static void areaSearch(int x, int y) {
        visited[x][y] = true;
        houseAreaAry[totalHouseCnt]++;
       for(int i = 0; i < 4; i++) {
           int sxNum = x + searchX[i];
           int syNum = y + searchY[i];

           if(sxNum >= 0 && syNum >= 0 && sxNum < mapLength && syNum < mapLength) {
               if(mapAry[sxNum][syNum] != 0 && !visited[sxNum][syNum]){
                   areaSearch(sxNum, syNum);
               }
           }
       }

    }

    private static void makeMap() {
        initMap();
        for(int i = 0; i < mapLength; i++) {
            String line = sc.next();
            for (int j = 0; j < mapLength; j++) {
                mapAry[i][j] = line.charAt(j) - '0';
            }
        }
    }

    private static void initMap() {
        mapAry = new int[mapLength][mapLength];
        visited = new boolean[mapLength][mapLength];
        for(int i = 0; i < mapLength; i++) {
            Arrays.fill(mapAry[i], 0);
            Arrays.fill(visited[i], false);
        }
    }

    private static void resultPrint() {
        System.out.println(totalHouseCnt);
        Arrays.sort(houseAreaAry);
        for(int i = 0; i < houseAreaAry.length; i++) {
            if(houseAreaAry[i] != 0)
                System.out.println(houseAreaAry[i]);
        }
    }
}