import java.util.Vector;
import java.util.*;

public class Basic_vector
{
    public static void main(String [] args)
    {
        Vector<String> vec = new Vector<>(2);
        vec.add("This");
        vec.add("is");
        vec.add("a");
        vec.add("vector");
        System.out.println(vec);
        System.out.println(vec.size());
        System.out.println(vec.capacity());




    }
}
