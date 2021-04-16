import java.util.ArrayList;
import java.util.Collection;
import java.util.*;

public class Basic_Arraylist
{
    public static void main(String [] args)
    {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(3);
        a.add(2);
        a.add(91);
        a.add(12);
        System.out.println(a);
        System.out.println(a.get(0));
        a.set(0,4);
        System.out.println(a);
        Collections.sort(a);
        System.out.println(a);
    }
}
