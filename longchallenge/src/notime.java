import java.util.Scanner;

public class notime
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int H = sc.nextInt();
        int x = sc.nextInt();
        int i =0;
        while(N-->0)
        {

            int t = sc.nextInt();
            if(H == x+t)
               i = 1;
        }
        if(i == 1) {
            System.out.println("YES");
        }
        else
            System.out.println("NO");
    }
}
