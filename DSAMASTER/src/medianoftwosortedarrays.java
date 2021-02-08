import java.util.Scanner;
import java.util.*;

public class medianoftwosortedarrays
{

    public static void main(String [] args)
    {
        Integer arr1 [] = new Integer[]{1,12,15,26,38};
        Integer arr2 [] = new Integer[]{2,13,17,30,45};
        int m = arr1.length;
        int n= arr2.length;
        Set<Integer> a = new HashSet<Integer>();
        Set<Integer> b = new HashSet<Integer>();
        a.addAll(Arrays.asList(arr1));
        b.addAll(Arrays.asList(arr2));
        Set<Integer> union = new HashSet<Integer>(a);
        union.addAll(b);
       // System.out.print(union);
        int x = union.size();
        int arr[] = new int[x];
        int j =0;
        for(Integer i :union)
        {
            arr[j++] = i;
        }
        //System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
       if(x%2==0)
       {
           int result = arr[x/2]+arr[(x/2)-1];
           System.out.print(result/2);
       }
       else
       {
           System.out.print(arr[x/2]);
       }
    }
}
