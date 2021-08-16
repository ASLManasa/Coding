package LinkedLIst;

import java.io.*;
import java.lang.*;
import java.util.*;

//Time Complexity o(nlogn)
public class merge_Sort {
//    static Node head;

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }

    static Node mergeSort(Node head) {
        if (head.next == null)
            return head;
        Node mid1 = mid(head);
        Node head2 = mid1.next;
        mid1.next = null;
        Node newHead1 = mergeSort(head);
        Node newHead2 = mergeSort(head2);
        Node finalHead = merge(newHead1, newHead2);
        return finalHead;

    }

    static Node merge(Node head1, Node head2) {
        Node merged = new Node(-1);
        Node temp = merged;
        while (head1 != null && head2 != null) {
            if (head1.data < head2.data) {
                temp.next = head1;
                head1 = head1.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
            }
            temp = temp.next;
        }
        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return merged.next;
    }

    //    will be using flyod cycle detection or Hare Approach
    static Node mid(Node head) {
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;

    }

    static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {
//        merge_Sort ll = new merge_Sort();
        Node head = new Node(7);
        Node temp = head;
        temp.next = new Node(10);
        temp = temp.next;
        temp.next = new Node(5);
        temp = temp.next;
        temp.next = new Node(20);
        temp = temp.next;
        temp.next = new Node(3);
        temp = temp.next;
        temp.next = new Node(2);
        temp = temp.next;
        printList(head);
        System.out.println( );

        System.out.println("Sorted Linked List :.....");
       head=mergeSort(head);
        printList(head);


    }
}
