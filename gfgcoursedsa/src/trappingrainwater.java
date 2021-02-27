import java.util.Scanner;

public class trappingrainwater
{
    public  static int water(int arr[],int len)
    {
        int storedwater = 0;
        for(int i =1;i<len-1;i++)
        {
            int minimum = arr[i];
            for(int j =0;j<i;j++)
            {
                minimum=Math.max(minimum,arr[j]);
            }
            int maximum = arr[i];
            for (int k =i+1;k<len;k++)
            {
                maximum=Math.max(maximum,arr[k]);
            }
            storedwater = Math.min(maximum,maximum)-arr[i];
        }
        return storedwater;
    }
    public static void main(String [] args)
    {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i =0;i< arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
        int len = arr.length;
        System.out.println(water(arr,len));
    }
}
