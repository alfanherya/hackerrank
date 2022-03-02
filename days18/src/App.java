
import java.util.LinkedList;
import java.util.Scanner;

public class App {

 
        LinkedList<Character> queue = new LinkedList<>();
        LinkedList<Character> stack = new LinkedList<>();

        public void pushCharacter(char c) {
            stack.push(c);
        }

        public void enqueueCharacter(char c) {
            queue.add(c);
        }

        public char popCharacter() {
            return stack.pop();
        }

        public char dequeueCharacter() {
            return queue.remove();
        }
    
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // convert input string to an array of characters;
        char[] s = input.toCharArray();

        // create a solution object
        App p = new App();

        // enqueue
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println("The word, " + input + ", is " 
        + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ));
        }

        

    }

    

