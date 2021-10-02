package Hashing;

import java.util.Hashtable;
import java.util.Optional;

public class Hash_Table
{
    public static void main(String [] args)
    {
        Hashtable<Integer,Integer> hm = new Hashtable<>();
        hm.put(1,1);
        hm.put(2,4);
        hm.put(3,9);
        System.out.println(hm);

    }
}
