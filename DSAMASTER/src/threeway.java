import java.util.Arrays;
import java.util.Scanner;

public class threeway
{
    public static void part(int arr [],int a ,int b)
    {
        int start = 0, end = arr.length-1;
        for(int i = 0; i <= end;)
        { if(arr[i] < a)
            { int temp = arr[start];
                arr[start] = arr[i];
                arr[i] = temp;
                start++;
                i++; }
            else if(arr[i] > b)
            {

                int temp = arr[end];
                arr[end] = arr[i];
                arr[i] = temp;
                end--;

            }

            else
                i++;
        }
    }
    public static void main(String [] args)
    {
        int arr[]=new int[]{1, 2, 3, 3, 4};
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        Arrays.sort(arr);
        part(arr,a,b);
    }
}
