import java.util.Scanner;

public class palindromemyprgrm
{
    public static void main(String [] args)
    {
        Scanner sc =   new  Scanner(System.in);
        StringBuffer str1 = new StringBuffer();
       // StringBuffer str2 = new StringBuffer();
        System.out.println("Enter the string");
        str1.append(sc.next());
        //System.out.println("Enter the 2nd string");
      //  str2.append(sc.next());
       StringBuffer str2 = str1.reverse();
        System.out.println(str1);
        System.out.println(str2);
        Boolean b = str1.equals(str2);
        if(b == true)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("not a palindrome");
        }
    }
}
