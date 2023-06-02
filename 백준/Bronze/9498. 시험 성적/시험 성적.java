import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            int score = Integer.parseInt(br.readLine());
            if(score >= 90) {
                System.out.println('A');
                return;
            }
            if(score >= 80) {
                System.out.println('B');
                return;
            }
            if(score >= 70) {
                System.out.println('C');
                return;
            }
            if(score >= 60) {
                System.out.println('D');
                return;
            }
            System.out.println('F');
        }catch (Exception e){
            
        }

    }
}