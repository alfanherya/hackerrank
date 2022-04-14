
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try(Scanner scanner = new  Scanner(System.in)){
            int i = 0;
            while (Scanner.hasNextLine()){
                System.out.println(String.format("%d %s", i++, Scanner.nextLine()));
            }

        }

    }
}
