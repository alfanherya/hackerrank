
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       Scanner in = new Scanner(System.in);
       int n = in.nextInt();

       in.nextLine();

       for (int i = 0; i < n; i++) {
           String string = in.next();
           char[] charArray = string.toCharArray();

           for(int j = 0; j < charArray.length; j++) {
               if(j % 2 == 0) {
                   System.out.print(charArray[j]);
               }
           }

           System.out.print(" ");

           for(int j = 0; j < charArray.length; j++) {
               if(j % 2 != 0) {
                   System.out.print(charArray[j]);
               }
           }
        //    System.out.printf();
       }
       in.close();
    }
}
