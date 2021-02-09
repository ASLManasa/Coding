import java.util.Scanner;

public class windowsliding
{
    public static int window(int[] arr, int k, int n)
    {
        int currentsum=0;

        if(n < k)
            return -1;
        for(int i =0;i<k;i++)
        {
            currentsum=currentsum+arr[i];
        }
        int windowsum = currentsum;
        for(int j =k;j< arr.length;j++)
        {
            windowsum += arr[j] - arr[j-k];
            currentsum = Math.max(currentsum,windowsum);
        }

        return currentsum;
    }
    public static void main(String [] args)
    {
        int arr [] = new int[]{1, 4, 2, 10, 2, 3, 1, 0, 20 };
        Scanner sc = new Scanner(System.in);
        int k= sc.nextInt();
        int n = arr.length;
        System.out.print(window(arr,k,n));

    }
}
