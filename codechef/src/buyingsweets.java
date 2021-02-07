import java.util.Scanner;

public class buyingsweets
{
    public static void cost(int arr[],int n,int x)
    {
        int sum  =0;
        for (int k =0;k< arr.length;k++)
        {
            sum+=arr[k];
        }
        //System.out.println(sum);
        int res = sum%x;
        /*if(sum<x)
        {
            System.out.println(-1);
        }*/
         if(res ==0)
                {
                    System.out.println(sum/x);
                }
        else {
            for (int h = 0; h < arr.length; h++) {
                if (arr[h] <= res) {
                    System.out.println(-1);
                    return;
                }
            }
        }
           System.out.println(sum / x);

    }
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t >0)
        {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < arr.length; i++)
            {
                arr[i] = sc.nextInt();
            }
            cost(arr,n,x);

        }
    }
}
