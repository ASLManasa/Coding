import java.util.Scanner;

public class StringBufferbasic
{
    public static void main(String [] args)
    {
        Scanner sc =new  Scanner(System.in);
        StringBuffer str = new StringBuffer();
        str.append(sc.next());
        int a = str.capacity();
        int b = str.length();
        System.out.println(str);
        System.out.println(a);
        System.out.println(b);
        str.reverse();
        System.out.println(str);


    }
}
