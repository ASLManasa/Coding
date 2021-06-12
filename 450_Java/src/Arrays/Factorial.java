package Arrays;
import java.math.*;
public class Factorial
{
    public static BigInteger fact(int n)
    {

            BigInteger b = new BigInteger("1");

            for (int i = 2; i <= n; i++) {

                b = b.multiply(BigInteger.valueOf(i));
            }

           return b;

    }
    public static void main(String [] args)
    {
        int n =10;
       System.out.print( fact(n));

    }
}
