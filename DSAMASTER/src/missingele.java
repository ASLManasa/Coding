import java.util.Scanner;

public class missingele
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr [] = new int[]{1,2,3,5};
        int sum = (n*(n+1)/2);
        System.out.println(sum);
        int finalsum = 0;
        for(int i =0;i< arr.length;i++)
        {
            finalsum = finalsum +arr[i];
        }
        System.out.println(finalsum);
        System.out.println(sum - finalsum);

    }
}
