
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//543년차이, 빼야함, 1000이상 3000미만
public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int ICPCyear = Integer.parseInt(br.readLine());

    if (ICPCyear < 1000 && ICPCyear > 3000) {
      return;
    }
    int yearGap = 543;
    System.out.println(ICPCyear - yearGap);
  }
}