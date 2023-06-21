import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws Exception{
        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());
        
        if(x <0 && y<0){
            System.out.println(3);
        } else if(x<0 && y > 0){
            System.out.println(2);
        }else if(x >0 && y < 0){
            System.out.println(4);
        }else {
            System.out.println(1);
        }
    }
}