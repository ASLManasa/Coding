package assignment3;

public class bubble_sort
{
    public static void sort(int arr[])
    {
        for(int i =0;i<arr.length-1;i++)
        {
            for(int j =0;j<arr.length-i-1;j++)
            {
                if(arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int i :arr)
        {
            System.out.print(i+" ");
        }
    }
    public static void main(String [] args)
    {
        int arr[] ={3,60,35,2,45,320,5};
        sort(arr);
    }
}
