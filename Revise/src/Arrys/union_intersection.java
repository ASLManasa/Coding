package Arrys;
import java.util.*;

public class union_intersection
{

    static void printUnion(int[] a, int n,
                           int[] b, int m)
    {
        Map<Integer, Integer> mp = new HashMap<Integer, Integer>();

        // Inserting array elements in mp
        for(int i = 0; i < n; i++)
        {
            mp.put(a[i], i);
        }
        for(int i = 0; i < m; i++)
        {
            mp.put(b[i], i);
        }

        System.out.println("The union set of both arrays is :");
        for(Map.Entry mapElement : mp.entrySet())
        {
            System.out.print(mapElement.getKey() + " "+mapElement.getValue());


        }
    }
    public static void main(String [] args)
    {
        int a[] = { 1, 2, 5, 6, 2, 3, 5 };
        int b[] = { 2, 4, 5, 6, 8, 9, 4, 6, 5 };

        printUnion(a, 7, b, 9);
    }
}
