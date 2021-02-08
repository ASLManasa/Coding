import java.util.Arrays;
import java.util.Scanner;

public class median
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];
        for(int i =0;i<N;i++)
        {
            arr[i]= sc.nextInt();
        }
        Arrays.sort(arr);
        if(N%2==0)
        {
            int result = arr[N/2]+arr[(N/2)-1];
            System.out.print(result/2);
        }
        else
        {
            System.out.print(arr[N/2]);
        }
    }
}
