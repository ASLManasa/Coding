import java.util.ArrayList;

public class Basic_Arraylist
{
    public static void main(String [] args)
    {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(3);
        a.add(6);
        a.add(9);
        a.add(12);
        System.out.println(a);
        System.out.println(a.get(0));
        a.set(0,4);
        System.out.println(a);
    }
}
