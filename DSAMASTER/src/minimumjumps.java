public class minimumjumps
{
    public static void minjum(int arr[],int n)
    {
        for(int i =0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main (String [] args)
    {
        int arr [] ={1,3,5,8,9,2,6,7,6,8,9 };
        int n =arr.length;
        minjum(arr,n);
    }
}
