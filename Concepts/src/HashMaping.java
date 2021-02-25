import java.util.HashMap;
import java.util.*;

public class HashMaping
{
    public static void main(String [] args) {
        int arr [] = {1,2,1,2,3,3,4,4,4};
        HashMap <Integer,Integer> hm = new HashMap<Integer,Integer>();
        for(int i =0;i< arr.length;i++)
        {
            Integer c = hm.get(arr[i]);
            if (hm.get(arr[i]) == null)
            {
                hm.put(arr[i],1);
            }
            else
                hm.put(arr[i],++c);
        }
        System.out.println(hm);
    }

}
