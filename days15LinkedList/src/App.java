
import java.util.Scanner;


class App{
    public static Node insert(Node head, int data){
        if(head == null){
            return new Node(data);
        }
        else if(head.next==null){
            head.next=new Node(data);
        }
        else{
            insert(head.next, data);
        }
        return head;
    }

    public static void display(Node head){
        Node start = head;
        while(start !=null){
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner =    new Scanner(System.in);
        Node head = null;
        int N = scanner.nextInt();

        while (N-- > 0) {
            int data = scanner.nextInt();
            head = insert(head, data);
        }

        display(head);
        scanner.close();
       
    }

}


class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }
}

