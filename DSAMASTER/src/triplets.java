import java.util.Scanner;

public class triplets
{
    public static void trisum(int arr[],int n,int k)
    {
        int sum = 0;
        for(int i =0;i< arr.length;i++)
        {
            sum = sum +arr[i];
        }
        if(sum==k)
            System.out.print("True");
        else
            System.out.print("True");
    }
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int arr[] = new int [n];
        for(int i =0;i< arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
        trisum(arr,n,k);

    }
}
