import java.util.Arrays;
import java.util.Scanner;

public class maxfun
{
    public static void maxf(int arr [] ,int n)
    {
        Arrays.sort(arr);
        int x = arr[0];
        int y = arr[1];
        int z = arr[n-1];
        int result = Math.abs(x-y)+Math.abs(y-z)+Math.abs(z-x);
        System.out.print(result);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0)
        {
            int n = sc.nextInt();
            int arr [] = new int[n];
            for(int i =0;i< arr.length;i++)
            {
                arr[i] = sc.nextInt();
            }
            maxf(arr,n);
        }
    }
}
