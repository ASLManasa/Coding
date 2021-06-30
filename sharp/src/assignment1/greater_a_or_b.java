package assignment1;

public class greater_a_or_b
{
    public static void compare(int a ,int b)
    {
        if(a > b)
            System.out.print("A is greater");
        else
            System.out.print("B is greater");

    }
    public static void main(String [] args)
    {
        int a =14;
        int b =5;
        compare(a,b);
    }
}
