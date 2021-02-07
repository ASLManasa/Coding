import java.util.Scanner;

public class ques2
{
    public static void min(int  arr[],int n)
    {
        int minvalue = arr[0];
        for(int i =0;i<arr.length;i++)
        {
            if (arr[i]<minvalue)
            {
                minvalue = arr[i];
            }
        }
        System.out.print("the mininmum value will be :"+ minvalue);
    }
    public static void max(int  arr[],int n)
    {
        int maxvalue = arr[0];
        for(int i =0;i<arr.length;i++)
        {
            if (arr[i]>maxvalue)
            {
                maxvalue = arr[i];
            }
        }
        System.out.print("the maximum value will be :"+ maxvalue);
    }
    public static void main(String [] args)

    {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int arr[] = new int [n];
        for(int i =0;i< arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
       /* for(int j =0;j< arr.length;j++)
        {
            System.out.print(arr[j]+" ");
        }*/
        min(arr,n);
        System.out.println(" ");
        max(arr,n);

    }
}
