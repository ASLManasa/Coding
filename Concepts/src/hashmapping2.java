import java.util.HashMap;
import java.util.*;

public class hashmapping2
{
    public static void main(String  [] args)
    {
        HashMap<String,Integer> hm = new HashMap<String,Integer>();
        hm.put("aa",1);
        hm.put("bb",2);
        hm.put("cc",3);
        hm.put("dd",4);
       /* for(Map.Entry m :hm.entrySet())
        {
            System.out.println(m.getValue()+"  "+m.getKey());
        }*/
        HashMap<String,Integer> hm1 = new HashMap<String,Integer>();
        hm1.put("ee",5);
        hm1.put("ff",6);
        hm1.put("gg",7);
        hm1.put("hh",8);
        hm.putAll(hm1);
        hm.putIfAbsent("ii",9);
        hm.replace("aa",10);
        System.out.println("Hash Map: \n");
       for(Map.Entry m :hm.entrySet())
        {
            System.out.println(m.getValue()+"  "+m.getKey());
        }
        System.out.println("key set :"+hm.keySet());
        System.out.println("values set :"+hm.values());
        System.out.println("entry set :"+hm.entrySet());




    }
}
