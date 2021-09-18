package BitManipulation;

public class Ispowerof2
{
    public static boolean powerof2(int n)
    {
       if(n==0)
           return false;

           return ((n & n - 1) ==0);
    }
    public static void main(String [] args)
    {
        int n =64;
        System.out.println(powerof2(n));
    }
}
