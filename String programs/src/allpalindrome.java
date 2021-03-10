import java.util.Scanner;

public class allpalindrome
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println("The original string:"+ s);
        char arr[] = s.toCharArray();
        String s2 ="";
        for(int j = arr.length-1;j>=0;j--)
        {
            s2+=arr[j];
        }
        System.out.println("The duplicate string will be:" +s2);
        if(s.equals(s2)==true)
            System.out.println("Palindromic");
        else
            System.out.println("not a Palindromic");

    }
}
