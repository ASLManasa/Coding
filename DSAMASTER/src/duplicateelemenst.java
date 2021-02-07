import java.util.Scanner;

public class duplicateelemenst
{
    public static void dupli(int arr [])
    {
        for(int i =0;i< arr.length;i++)
        {
            for(int j =i+1 ;j< arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    System.out.print(arr[i]);
                }
            }
        }
    }
    public static void main(String [] args)
    {
       int arr[] = {1,1,2,4,5};
       int n= arr.length;
       dupli(arr);
    }
}
