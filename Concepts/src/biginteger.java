import java.math.*;
import java.util.Scanner;

public class biginteger
{
    public static void main(String[] args)
    {
        //BigInteger A;
        //BigInteger B;
        Scanner sc = new Scanner(System.in);
        BigInteger A = sc.nextBigInteger();
        BigInteger B = sc.nextBigInteger();
        //BigInteger sum;
        BigInteger sum = A.add(B);
        System.out.print(sum);
    }
}
