
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine().trim());

        if (N % 5 == 0) {
            System.out.println("A");
        }
        if (N % 5 == 1) {
            System.out.println("B");
        }
        if (N % 5 == 2) {
            System.out.println("C");
        }
        if (N % 5 == 3) {
            System.out.println("D");
        }
        if (N % 5 == 4) {
            System.out.println("E");
        } else {
            System.out.println("Nothing");
            // 0=a, 1=b, 2=c, 3=d, 4=e

            bufferedReader.close();
        }
    }

}
