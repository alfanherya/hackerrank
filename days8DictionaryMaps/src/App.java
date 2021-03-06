
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        Map<String, Integer> myMap = new HashMap<String, Integer>();

        for (int i = 0; i < n; i++) {
            String name = in.next();
            int phone = in.nextInt();

            myMap.put(name, phone);
        }

        while(in.hasNext()){
            String s = in.next();

            if(myMap.get(s) !=null)
                System.out.println(s + "=" + myMap.get(s)); 
            else
                System.out.println("not found");
        }

        in.close();
    }
}
