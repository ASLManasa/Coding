import java.util.Scanner;

public class pairssum
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int count =0;
        int sum;
        int arr[]=new int[]{1, 1, 1, 1};
        int  k = sc.nextInt();
        for(int i =0;i< arr.length;i++)
        {
            for(int j =i+1;j< arr.length;j++)
            {
                sum = arr[i]+arr[j];
                if(sum == k)
                {
                    count++;
                }
            }
        }
        System.out.print(count);
    }
}
