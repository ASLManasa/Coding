package Array;

import java.util.ArrayList;
import java.util.*;

public class arraylist
{
    public static void main(String [] args)
    {
        ArrayList<Integer> arr = new ArrayList<>(3);
        for(int i =0;i<3;i++)
        {
            arr.add(i);
        }

            System.out.println(arr);
      arr.remove(1);
        System.out.println(arr);

        for(int i =0;i<arr.size();i++ )
        {
            System.out.println(arr.get(i));
        }

    }
}
