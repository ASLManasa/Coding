import java.util.Scanner;

public class sumn
{
    //o(n) code time complexity
    public static int sum(int n)
    {
        int sum =0;
        for (int i =0;i<=n;i++)
        {
            sum = sum+i;
        }
        return sum;
    }
    public static int time(int n )
    {
        //0(1) time complexity
        int sum = n*(n+1)/2;
        return sum;
    }
    public static void main(String  [] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       System.out.println(sum(n));
        System.out.println(time(n));

    }
}
