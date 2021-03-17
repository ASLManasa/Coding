import java.util.LinkedList;

public class Basic_Linked_List
{
    public static void main(String [] args)
    {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(2);
        ll.add(4);
        ll.add(6);

        System.out.println(ll);
        System.out.println(ll.getFirst());
        System.out.println(ll.getLast());
    }
}
