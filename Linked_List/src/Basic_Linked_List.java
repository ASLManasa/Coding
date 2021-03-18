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

        LinkedList<Integer> link = new LinkedList<>();
        for(int i =0;i<5;i++)
        {
            link.add(i);
        }
        System.out.println(link);
        System.out.println(link.size());

    }
}
