
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            String S = br.readLine();
            System.out.println(""+Integer.parseInt(S));
        }catch(Exception e){
            System.out.println("Bad String");
        }

        br.close();
    }
}
