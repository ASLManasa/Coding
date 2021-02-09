import java.util.Scanner;

public class summax
{
    public static void maxarr(int arr [],int k,int n)
    {
        int max_int = Integer.MIN_VALUE;

        for(int i =0;i< n-k+1;i++)
        {
            int sum =0;
            for(int j =0;j < k;j++)
         {
            sum = sum + arr[i+j];
         }
            max_int = Math.max(sum,max_int);

        }
        System.out.print(max_int);
    }
    public static void main(String [] args)
    {
        int arr[] = new int []{1, 4, 2, 10, 2, 3, 1, 0, 20 };
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n= arr.length;
        maxarr(arr,k,n);
    }
}
