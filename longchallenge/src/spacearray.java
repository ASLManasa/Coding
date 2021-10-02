import java.util.Arrays;
import java.util.Scanner;

public class spacearray
{
    public static void winner(int arr[],int N)
    {
        int diff =0;
        int count =0;
        Arrays.sort(arr);
        for(int i =0;i< arr.length;i++) {
            diff = Math.abs(arr[i]-(i+1));
            if(arr[i]>i+1)
                count++;

        }
        if(count!=0 && diff%2!=0)
            System.out.println("Second");
        else if(diff%2==0)
            System.out.println("Second");
        else
            System.out.println("First");


    }
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i =0;i<T;i++)
        {
            int N = sc.nextInt();
            int [] arr= new int[N];
            for(int j =0;j< arr.length;j++)
            {
                arr[j] = sc.nextInt();
            }
            winner(arr,N);

        }
    }
}
