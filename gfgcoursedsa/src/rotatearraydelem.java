import java.util.Scanner;

public class rotatearraydelem
{
    public static void rotate(int arr[],int n ,int d)
    {
        int temp[] = new int[d];
        for(int i =0;i<d;i++)
        {
            temp[i] = arr[i];
        }

        for(int j =0;j<n-d;j++)
        {
            arr[j] = arr[j+d];
        }
        for(int i = 0;i< d; i++)
        {
                arr[i+n-d] = temp[i];

        }
        for(int k =0;k<arr.length;k++)
        {
            System.out.println(arr[k]+" ");
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int arr[] = new int[n];
        for(int i =0;i< arr.length;i++)
        {
            arr[i] = sc.nextInt();

        }
        rotate(arr,n,d);
    }
}
