import java.util.Scanner;

public class minswap
{
    public static void main(String [] args)
    {
        int arr[] = new int []{2, 1, 5, 6, 3};
        int n= arr.length;
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();

        int count = 0;
        for (int i = 0; i < n; ++i)
            if (arr[i] <= k)
                ++count;
        int bad = 0;
        for (int i = 0; i < count; ++i)
            if (arr[i] > k)
                ++bad;

        // Initialize answer with 'bad' value of
        // current window
        int ans = bad;
        for (int i = 0, j = count; j < n; ++i, ++j) {

            // Decrement count of previous window
            if (arr[i] > k)
                --bad;

            // Increment count of current window
            if (arr[j] > k)
                ++bad;

            // Update ans if count of 'bad'
            // is less in current window
            ans = Math.min(ans, bad);
        }
        System.out.print(ans);
    }
}
