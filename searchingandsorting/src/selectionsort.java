import java.util.Arrays;
import java.util.Scanner;

public class selectionsort
{
    public static void sort(int arr[],int N)
    {
        int value=0;
        for (int k =0;k< arr.length;k++)
        {
            int min =k;
            for(int m =k+1;m< arr.length;m++)
            {
                if(arr[min]>arr[m])
                    min = m;
            }
            value = arr[min];
            arr[min] = arr[k];
            arr[k]= value;


        }
    }
    public static void main(String [] args)
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
