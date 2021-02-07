import java.util.Scanner;

public class factorial21
{
    public static int fact(int N)
    {
        if (N==1)
            return 1;
        else
            return  N * fact(N-1);

    }




    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- >0)
        {
            int N = sc.nextInt();
            System.out.print(fact(N));
            System.out.print("\n");
        }

    }
}
