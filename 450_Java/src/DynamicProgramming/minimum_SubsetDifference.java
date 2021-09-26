package DynamicProgramming;
//time complexity :o(n*sum)

public class minimum_SubsetDifference {
    public static int findMinRec(int arr[], int n, int k, int range) {
        boolean dp[][] = new boolean[n + 1][range + 1];
        for (int i = 0; i <= n; i++)
            dp[i][0] = true;

        for (int i = 1; i <= range; i++)
            dp[0][i] = false;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= range; j++) {

                dp[i][j] = dp[i - 1][j];


                if (arr[i - 1] <= j)
                    dp[i][j] |= dp[i - 1][j - arr[i - 1]];
            }
        }
        int ans = Integer.MAX_VALUE;
        int diff = 0;
        for (int j = range / 2; j >= 0; j--) {
            if (dp[n][j] == true) {
                diff = range - 2 * j;
                ans = Math.min(diff, ans);
            }
        }
        return ans;
    }

    public static int findMin(int arr[], int n) {
        int range = 0;
        for (int i = 0; i < arr.length; i++) {
            range = range + arr[i];

        }
        return findMinRec(arr, n, 0, range);
    }

    public static void main(String[] args) {
        int arr[] = {3, 1, 4, 2, 2, 1};
        int n = arr.length;
        System.out.print("The minimum difference" + " between two sets is " + findMin(arr, n));
    }

}
