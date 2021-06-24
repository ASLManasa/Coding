package Strings;

public class rotation_of_string
{
    public static boolean isrotate(String s1,String s2)
    {
        String temp = s1.concat(s1);
        if(temp.contains(s2))
            return true;
        return false;
    }
    public static void main(String []args)
    {
        String str1 = "AACD";
        String str2 = "ACDA";
        System.out.print(isrotate(str1,str2));
    }
}
