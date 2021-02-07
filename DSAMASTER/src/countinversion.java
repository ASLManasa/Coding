import java.util.Scanner;

public class countinversion {
    public static boolean inversion(int[] arr, int n) {
        int result = 0;
        for (int i = 0; i < n-1; i++) {
            if (arr[i] >arr[i + 1])
            {
              return false;
            }

        }
        return true;
    }

    public  static void main(String [] args)

    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr [] = new int[n];
        for(int i =0;i<n;i++)
        {
            arr[i] = sc.nextInt();

        }
       System.out.print (inversion(arr,n));
    }
}
