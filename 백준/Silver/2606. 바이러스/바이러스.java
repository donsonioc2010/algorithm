
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    final static int START_PC = 1;
    static int pcNum;
    static int pcLine;
    static boolean[] visited;
    static boolean[][] mapAry;
    static int virusPc = 0;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        pcNum = sc.nextInt();  // 100 이하
        pcLine = sc.nextInt(); // Node 갯수 인풋

        /* Validation */
        if(pcNum > 100 || pcNum < 1) {
            return;
        }

        /* 배열 선언 */
        initAry();

        /* 맵 제작 */
        for(int i = 0 ; i < pcLine; i++) {
            int to      = sc.nextInt();
            int from    = sc.nextInt();
            setLine(to, from);
        }

        dfs(START_PC);
        System.out.println(virusPc-1);
    }

    /* 배열 선언 및 초기화 */
    private static void initAry() {
        visited = new boolean[pcNum + 1];
        mapAry = new boolean[pcNum+1][pcNum+1];

        for(int i = 0; i <= pcNum; i++) {
            Arrays.fill(mapAry[i], false);
        }
    }

    /* 맵 제작 */
    private static void setLine(int to, int from) {
        mapAry[to][from] = mapAry[from][to] = true;
    }

    private static void dfs(int num) {
        visited[num] = true;
        virusPc++;
        for(int i = 0; i <= pcNum; i++) {
            if(!visited[i] && mapAry[num][i]) { //mapAry[num][i] == true : 길이 있슴
                dfs(i);
            }
        }
    }
}
