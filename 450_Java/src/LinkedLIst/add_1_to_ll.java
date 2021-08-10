package LinkedLIst;

public class add_1_to_ll {
    static Node head;
//    private add_1_to_ll ll;

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    static Node newNode(int data) {
        Node new_node = new Node(data);
        new_node.data = data;
        new_node.next = null;
        return new_node;
    }
    static Node addOneUtil(Node head)
    {
        // res is head node of the resultant list
        Node res = head;
        Node temp = null, prev = null;

        int carry = 1, sum;

        while (head != null) // while both lists exist
        {
            // Calculate value of next digit in resultant
            // list. The next digit is sum of following
            // things (i) Carry (ii) Next digit of head list
            // (if there is a next digit)
            sum = carry + head.data;

            // update carry for next calulation
            carry = (sum >= 10) ? 1 : 0;

            // update sum if it is greater than 10
            sum = sum % 10;

            // Create a new node with sum as data
            head.data = sum;
            // Move head and second pointers to next nodes
            temp = head;
            head = head.next;
        }

        // if some carry is still there, add a new node to
        // result list.
        if (carry > 0)
            temp.next = newNode(carry);

        // return head of the resultant list
        return res;
    }

    static Node reverse(Node head)
    {
        Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
    static Node addOne(Node head)
    {
        // Reverse linked list
        head = reverse(head);

        // Add one from left to right of reversed
        // list
        head = addOneUtil(head);

        // Reverse the modified list
        return reverse(head);
    }

    static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data);
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        add_1_to_ll ll = new add_1_to_ll();
//        ll.head = new Node(5);
        Node head = newNode(1);
        head.next = newNode(9);
        head.next.next = newNode(9);
        head.next.next.next = newNode(9);
        System.out.print("Resultant list is ");
        ll.printList(head);

       head = addOne(head);
        System.out.println();
        System.out.print("Resultant list is ");
        printList(head);

    }

}
