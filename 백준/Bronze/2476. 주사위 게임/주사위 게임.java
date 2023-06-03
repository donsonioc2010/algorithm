import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int person;

        person = Integer.parseInt(br.readLine());
        if (person < 2 || person > 1000) {
            return;
        }

        int[] gamerCnt = new int[(person * 3)+10];

        int tmp=0;
        int j = 0;
        String str = "";
        for (int i = 0; i < person; i++) {
            str = br.readLine();
            StringTokenizer st = new StringTokenizer(str," ");
            while (st.hasMoreTokens()) {
                gamerCnt[j++] = Integer.parseInt(st.nextToken());
            }
            int sum= check(gamerCnt,i*3);
            tmp = sum > tmp? sum:tmp;
        }
        System.out.println(tmp);
    }
    public static int check(int[] gamerCnt,int i){
    int sum;

        if (gamerCnt[i] == gamerCnt[i+1] && gamerCnt[i+1] == gamerCnt[i+2] && gamerCnt[i] == gamerCnt[i+2] )
            sum = 10000 + (gamerCnt[i] * 1000);
        else if (gamerCnt[i] == gamerCnt[i+1] || gamerCnt[i] == gamerCnt[i+2])
            sum = 1000 + (gamerCnt[i] * 100);
        else if (gamerCnt[i+1] == gamerCnt[i+2])
            sum = 1000 + (gamerCnt[i+1] * 100);
        else {
            int max = Math.max(gamerCnt[i], Math.max(gamerCnt[i+1], gamerCnt[i+2]));
            sum = max * 100;
        }

       return sum;

    }
}