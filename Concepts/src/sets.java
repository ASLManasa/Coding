import java.util.*;
public class sets
{
    public static void main(String [] args)
    {
        Set <Integer> a = new HashSet<Integer>();
        a.addAll(Arrays.asList(new Integer[]{1,2,3,4,5}));
        Set<Integer> b = new HashSet<Integer>();
        b.addAll(Arrays.asList(new Integer[]{4,5,6,7}));
        Set<Integer> union = new HashSet<Integer>(a);
        union.addAll(b);
        System.out.print(union);
        Set<Integer> intersection = new HashSet<Integer>(a);
        intersection.retainAll(b);
        System.out.print(intersection);
        Set<Integer> diff = new HashSet<Integer>(b);
        diff.removeAll(a);
        System.out.print(diff);

    }
}
