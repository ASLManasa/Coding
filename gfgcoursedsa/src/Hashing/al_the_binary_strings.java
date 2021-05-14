package Hashing;

public class al_the_binary_strings
{
    public static void print(int arr[],int n)
    {
        for(int i =0;i< arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println( );
    }
    public static void bin(int n,int arr[],int i)
    {
        if(i==n) {
            print(arr, n);
            return;
        }
        arr[i] =0;
        bin(n,arr,i+1);
        arr[i] =1;
        bin(n,arr,i+1);
    }
    public static void main(String []  args)
    {
        int n =2;
        int arr[] = new int[n];
        bin(n,arr,0);

    }
}
