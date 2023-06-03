import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<ArrayList<Integer>> node;
    static int[] nodeColor;
    static final int RED = 1, GREEN = -1;
    static final String YES = "YES", NO = "NO";

    public static void main(String[] args) {
        int K = sc.nextInt();           // TestCase 횟수

        for(int i = 0; i < K; i++) {
            int V = sc.nextInt();       // 정점의 갯수       (방을 만들어야 하는 갯수)
            int E = sc.nextInt();       // Node(간선)의 갯수 (반복문 돌아야 하는 횟수)
            boolean ans = true;

            initArrayList(V);
            for(int j = 0; j < E; j++) {
                int from = sc.nextInt() - 1;
                int to = sc.nextInt() - 1;
                addNode(from, to);
            }
            nodeColor = new int[V];
            for(int j = 0; j< V; j++) {
                if(nodeColor[j] == 0) {
                    if(!bfs(j)) {
                        ans = false;
                        break;
                    }
                }
            }
            if(ans) {
                System.out.println(YES);
                continue;
            }
            System.out.println(NO);
        }

    }

    private static boolean bfs(int n) {
        Queue<Integer> q = new LinkedList<>();
        q.add(n);
        nodeColor[n] = RED;

        while(!q.isEmpty()) {
            int nodeNum = q.poll();

            for(Integer i : node.get(nodeNum)) {
                if(nodeColor[i] == nodeColor[nodeNum]) {
                    //인접한 곳의 색상이 같은경우
                    return false;
                }
                if(nodeColor[i] == 0) {
                    // 방문을 하지 않은 경우 이건신박하다..
                    if(nodeColor[nodeNum] == RED) {
                        nodeColor[i] = GREEN;
                    } else {
                        nodeColor[i] = RED;
                    }
                    q.add(i);
                }
            }

        }

        return true;
    }

    private static void initArrayList(int V) {
        node = new ArrayList<ArrayList<Integer>>();
        for(int i = 0; i < V; i++) {
            node.add(new ArrayList<>());
        }
    }

    private static void addNode(int from, int to) {
        node.get(from).add(to);
        node.get(to).add(from);
    }
}