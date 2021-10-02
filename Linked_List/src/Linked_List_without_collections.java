import java.util.LinkedList;

public class Linked_List_without_collections {
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head = null;
    public Node tail = null;

    public void addNode(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            tail = newnode;
        } else {
            tail.next = newnode;
            tail = newnode;
        }
    }

    public void display() {
        Node current = head;
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("data in the nodes:");
        int count = 0;
        while (current != null) {
            System.out.println(current.data + " ");
            count = count + 1;
            current = current.next;
        }
        System.out.println();
        System.out.println("The length of the Linked List :" + count);
    }


    public static void main(String[] args) {
        Linked_List_without_collections ll = new Linked_List_without_collections();
        ll.addNode(3);
        ll.addNode(4);
        ll.addNode(5);
        ll.display();


    }

}
