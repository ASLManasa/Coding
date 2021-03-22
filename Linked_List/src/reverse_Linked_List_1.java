import java.util.LinkedList;
import java.util.*;

public class reverse_Linked_List_1
{
    public static class node
{
    int data;
    node next;
}

    public static void main(String [] args)
    {
        node new1 = new node();
        node new2 = new node();
        node new3 = new node();
        node new4 = new node();
        new1.data = 2;
        new2.data = 3;
        new3.data = 4;
        new4.data = 5;

        new4.next=new3;
        new3.next=new2;
        new2.next=new1;
        new1.next=null;

        for(int i =4;i>=1;i--)
        {
            System.out.println(new4.data +" ");
            new4 = new4.next;
        }



    }
}
