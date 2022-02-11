
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws Exception {
       BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
       int N = Integer.parseInt(bufferedReader.readLine().trim());
        
       if(N % 2 == 0){
           if(N < 3) System.out.println("Not Weired");
           else if(N < 24) System.out.println("Weird");
           else System.out.println("Not Weired");
       } else System.out.println("Weird");

       bufferedReader.close();
    }
}
