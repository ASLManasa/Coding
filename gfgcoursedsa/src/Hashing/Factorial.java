package Hashing;

public class Factorial
{
    public static int fact(int x)
    {
        if(x==1|| x==0)
            return 1;
        else
            return x*fact(x-1);
    }
    public static void main (String [] args)
    {
        int x =17;
        System.out.println(fact(x));
    }
}
