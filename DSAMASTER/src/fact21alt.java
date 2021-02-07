import java.util.*;
import java.math.*;
public class fact21alt
{
    public static void fact(int N) {
        if (N <= 1) {
            System.out.println(1);
            return;
        }

        BigInteger b = new BigInteger("1");

        for (int i = 2; i <= N; i++) {

            b = b.multiply(BigInteger.valueOf(i));
        }
    }
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0)
        {
            int N = sc.nextInt();
            //System.out.println(fact(N));
            fact(N);
            //System.out.print("\n");
        }
    }
}
