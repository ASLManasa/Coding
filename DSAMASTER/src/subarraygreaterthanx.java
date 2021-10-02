import java.util.Arrays;
import java.util.Scanner;

public class subarraygreaterthanx
{
    public static void sub(int arr[],int n ,int x)
    {
        Arrays.sort(arr);

    }
    public static void main(String [] args)
    {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter the x value: ");
        int x = sc.nextInt();
        System.out.print("Enter the size of the array ");
        int n = sc.nextInt();
        int arr [] = new int[n];
        System.out.print("Enter the array values : ");
        for(int i =0;i< arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
        sub(arr,n,x);

    }
}
