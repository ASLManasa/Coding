import java.util.Arrays;
import java.util.Scanner;

/* logic is to compare adjacent elements to get a sorted array*/
public class bubblesort
{
    public static void sort(int arr[],int N)
    {
        int temp =0;
        for(int i =0;i< arr.length;i++)
        {
            for(int j =1;j< arr.length-i;j++)
            {
                if(arr[j-1] > arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public static void  main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int N = sc.nextInt();
        int arr [] = new int[N];
        System.out.println("Enter the"+ N + "elements of the array:");
        for(int i=0 ;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
        sort(arr,N);
       System.out.println(Arrays.toString(arr));
    }
}
