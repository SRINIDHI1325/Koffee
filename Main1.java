import java.util.*;

class Node {
    int data;
    Node next;

    Node(int num) {
        this.data = num;
        this.next = null;
    }

}

class Linkedlist {

    Node head;
    Node temp;

    void Insert(int n) {
        Node nn = new Node(n);
        if (head == null) {
            head = nn;
        } else {
            temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = nn;
        }
    }

    void Display() {
        if (head == null) {
            System.out.println(0);
        } else {
            temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;

            }
        }
    }

}

public class Main1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Linkedlist l = new Linkedlist();

        for (int i = 0; i < num; i++) {
            int newn = sc.nextInt();
            l.Insert(newn);
        }
        l.Display();

    }

}