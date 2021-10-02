import java.util.Arrays;
import java.util.Scanner;

public class firstlastocciurence
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- >0)
        {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int arr [] = new int[n];
            for(int i =0;i<arr.length;i++)
            {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            for(int k =0;k< arr.length;k++)
            {
                if(arr[k] == x)
                    System.out.println(k+1);

            }
        }
    }
}
