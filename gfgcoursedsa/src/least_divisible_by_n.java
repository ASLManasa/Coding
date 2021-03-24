import java.util.Scanner;

public class least_divisible_by_n
{
    public static long getSmallestDivNum(int n){

            long s=1;

            for(long i =2;i<=n;i++)
            {
                s = lcm(s,i);
            }

            return s ;

        }

        public static long gcd(long a,long b)
        {
            if(b==0)
                return a ;
            else
                return gcd(b,a%b);
        }

        public static long lcm(long a,long b)
        {
            return (a*b)/gcd(a,b);
        }


    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

    }
}
