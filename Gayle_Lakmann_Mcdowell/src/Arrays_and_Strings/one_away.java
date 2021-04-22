package Arrays_and_Strings;

public class one_away
{
    public static Boolean oneEditAway(String s1,String s2)
{
    int n1 = s1.length();
    int n2 = s2.length();
    if(n1 == n2)
        return one_Edit_repacement(s1,s2);
    else if (n1 +1 == n2 )
        return one_Edit_insert(s1,s2);
    else if ( n2+1 == n1)
        return one_Edit_insert(s2,s1);
    return false;
}
public static Boolean one_Edit_repacement(String s1, String s2)
{
    Boolean b = false;
    for(int i =0;i<s1.length();i++)
    {
        if(s1.charAt(i) != s2.charAt(i))
        {
            if(b)
                return false;
        }
        b = true;
    }
    return true;
}
public static Boolean one_Edit_insert(String s1,String s2)
{
    int index1 = 0;
    int index2 = 0;
    while (index2 < s2.length() && index1 < s1.length()) {
        if (s1.charAt(index1) != s2.charAt(index2)) {
            if (index1 != index2) {
                return false;
            }
            index2++;
        } else {
            index1++;
            index2++;
        }
    }
    return true;
}

    public static void main(String [] args)
    {
        String s1 = "pale";
        String s2 = "bae";
        Boolean is_one_away = oneEditAway(s1,s2);
        System.out.println("The two strings is one away from replacement , insertion , or removal : "+ is_one_away);
    }
}
