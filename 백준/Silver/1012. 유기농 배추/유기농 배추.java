
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);

    private static int t;		// 테스트케이스 개수
    private static int m;		// 배추밭의 가로길이
    private static int n;		// 배추밭의 세로길이
    private static int k;		// 배추가 심어져 있는 위치와 갯수

    private static int MIN_MN_VALUE = 1, MAX_MN_VALUE = 50;
    private static int MIN_K_VALUE = 1, MAX_K_VALUE = 2500;

    private static int bugCnt;			// 지렁이 Cnt;

    private static boolean[][] map;
    private static boolean[][] visited;

    private static int[] searchX = {0, 0, 1, -1};
    private static int[] searchY = {1, -1 , 0, 0};

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        t = sc.nextInt();

        for(int i = 0 ; i < t; i++) {
            bugCnt = 0;
            inputMNK();

            if(!validationInputNumber()) {
                break;
            }

            makeCreep();
            for(int j = 0; j < k; j++) {
                int x = sc.nextInt();   // 가로
                int y = sc.nextInt();   // 세로
                makeCreep(x, y);
            }

            for(int x = 0; x < m; x++) {        //가로
                for(int y = 0; y < n; y++) {    //세로
                    if(!visited[x][y] && map[x][y]) {
                        bugCnt++;
                        dfs(x, y);
                    }
                }
            }

            sb.append(bugCnt+"\n");
        }
        System.out.println(sb.toString());
    }

    private static void dfs(int x, int y) {
        visited[x][y] = true;
        for(int i = 0; i < 4; i++) {
            int dx = x - searchX[i];
            int dy = y - searchY[i];

            if((dx >= 0 && dx <= m-1 && dy >= 0 && dy <= n-1) && !visited[dx][dy] && map[dx][dy]) {
                dfs(dx, dy);
            }
        }


    }

    // Init Map
    private static void makeCreep() {
        map     = new boolean[m][n];
        visited = new boolean[m][n];

        for(int i = 0; i< m; i++) {
            Arrays.fill(map[i], false);
            Arrays.fill(visited[i], false);
        }
    }

    // Input Map Node
    private static void makeCreep(int x, int y) {
        map[x][y] = true;
    }

    // M, N, K Data Input
    private static void inputMNK() {
        m = sc.nextInt();
        n = sc.nextInt();
        k = sc.nextInt();
    }

    // Validation
    private static boolean validationInputNumber() {
        if((m >= MIN_MN_VALUE && m <= MAX_MN_VALUE) &&
                (n >= MIN_MN_VALUE && n <= MAX_MN_VALUE ) &&
                (k >= MIN_K_VALUE && k <= MAX_K_VALUE)) {
            return true;
        }
        return false;
    }
}