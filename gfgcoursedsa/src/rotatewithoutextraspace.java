import java.util.Scanner;

public class rotatewithoutextraspace
{
    public static void rotate(int arr[],int n,int d)
    {
        int temp = arr[0];
        for(int i =0;i< arr.length-1;i++)
        {
            arr[i]= arr[i+1];
        }
        arr[n-1] = temp;
        /*for(int i :arr)
        {
            System.out.println(i+"  ");
        }*/


    }
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int arr[] = new int[n];
        for(int i =0;i< arr.length;i++)
        {
            arr[i] = sc.nextInt();

        }
        for(int i =0;i<d;i++) {
            rotate(arr, n, d);
        }
        System.out.println(java.util.Arrays.toString(arr));
    }
}
