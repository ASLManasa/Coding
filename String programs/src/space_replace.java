import java.util.Locale;

public class space_replace
{
    public static void main(String [] args)
    {
        String s = "madam";
        String s2=s.replaceAll(" [^a-zA-Z0-9]","").replaceAll(",","").replaceAll(":","").toLowerCase(Locale.ROOT);
        //System.out.println(s2);
        if(s2.length() ==1)
            System.out.println("palindrome");
        if(s2.length() ==0)
            System.out.println("palindrome");
        String reverseStr= "";
        for (int i = (s2.length() - 1); i >=0; --i) {
            reverseStr = reverseStr +s2.charAt(i);
        }
        if(reverseStr.equals(s2))
            System.out.println("palindrome");
        else
            System.out.println("not a palindrome");
    }
}
