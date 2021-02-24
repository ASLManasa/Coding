import java.util.Scanner;

public class trailingzeros
{
    public  static void main(String [] args)
    {
        int cout =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value: ");
        int n = sc.nextInt();
        for(int i =5;i >=1;i=i*5)
        {
            cout = cout+n/i;

        }
        System.out.println(cout);
    }
}
