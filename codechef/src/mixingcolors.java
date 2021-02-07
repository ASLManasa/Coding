import java.util.Scanner;

public class mixingcolors
{
    public static void mix(int arr[],int n)
    {
        for(int i =0;i< arr.length;i++)
        {
            for(int j = arr.length-1;j>0;j--)
            {
                if(arr[i] == arr[j])
                    System.out.print(0);
                else
                {

                }
            }
        }
    }
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- >0)
        {
            int n = sc.nextInt();
            int arr[]=new int [n];
            for(int i =0;i< arr.length;i++)
            {
                arr[i]=sc.nextInt();
            }
            mix(arr,n);
        }
    }
}
