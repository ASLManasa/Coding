import java.util.Scanner;

public class nottime
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int H = sc.nextInt();
        int x = sc.nextInt();
        int arr[]= new int[N];
        for(int i =0;i<arr.length;i++)
        {
            arr[i]= sc.nextInt();
        }
        for(int i =0;i< arr.length;i++)
        {

            if(arr[i]+x == H )
            {
                System.out.println("yes");
            }
           // break;
        }
    }
}
