
import java.util.Scanner;


public class App {
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0){
            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculatpr = new Calculator();
            try{
                int ans = myCalculatpr.power(n, p);
                System.out.println(ans);
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }

    
}

class Calculator{
    public int power(int n, int p) throws Exception{
        if(n < 0 || p < 0){
            throw new Exception("n and p should be non-negative");
        }
        return (int)Math.pow(n, p);
    }
}
