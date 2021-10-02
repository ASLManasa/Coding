package Arrays;

public class subarray
{
    public static void sub_arra(int arr[])
    {
        for(int i =0;i<arr.length;i++)
        {
            for(int j =i;j<=arr.length;j++)
            {
                for(int k =i;k<j;k++)
                {
                    System.out.print(arr[k]);
                }
                System.out.println();
            }
        }
    }
    public static void main(String [] args)
    {
        int arr[] = {1,4,2,5,3};
        sub_arra(arr);
    }
}
