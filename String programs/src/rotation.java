import java.util.Scanner;

public class rotation
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
       String s1= sc.next();
       String s2 = sc.next();
       if(s1.length() == s2.length() && (s1+s1).indexOf(s2) != -1)
       {
           System.out.println("rotations");
       }
       else
           System.out.println("not rotated");
    }
}
