import java.util.HashMap;
import java.util.*;

public class HashMaping
{
    public static void main(String [] args)
    {
        int arr[] = { 10, 34, 5, 10, 3, 5, 10 };
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i =0;i< arr.length;i++)
        {
            Integer c = hm.get(arr[i]);
            //System.out.print(c+" ");
            if( c == null)
                hm.put(arr[i],1);
            else
                hm.put(arr[i],++c);
        }
        /*for (Map.Entry m:hm.entrySet())
            System.out.println("Frequency of " + m.getKey() +
                    " is " + m.getValue());*/
        System.out.print(hm);
    }
}
