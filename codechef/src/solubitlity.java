import java.util.Scanner;

public class solubitlity
{
    public static int soluble(int X,int A,int B)
    {
        int ans =0;
        int val = A + (100 - X) * B;
        ans = val*10;
        return ans;

    }
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0)
        {
            int X = sc.nextInt();
            int A = sc.nextInt();
            int B = sc.nextInt();
           System.out.println( soluble(X,A,B));


        }
    }
}
