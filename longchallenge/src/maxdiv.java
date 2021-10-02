import java.util.Scanner;

public class maxdiv
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int maximum = 1;
        for (int i =1;i<=10;i++)
        {
            if(N%i ==0 )
            {
                if( i >maximum)
                {
                    maximum = i ;
                }
            }

        }
       System.out.print(maximum);


    }
}
