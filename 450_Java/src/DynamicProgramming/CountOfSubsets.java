package DynamicProgramming;

public class CountOfSubsets {
    public static int subsetSum(int a[], int n, int sum) {
        int dp[][] = new int[n + 1][sum + 1];
        dp[0][0] = 1;
        for (int i = 0; i < a.length; i++) {
            dp[0][i] = 0;
        }
        for (int i = 0; i < a.length; i++) {
            dp[i][0] = 1;
        }
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <= sum; j++) {
                if (a[i - 1] > j)
                    dp[i][j] = dp[i - 1][j];
                else {
                    dp[i][j] = dp[i - 1][j] + dp[i-1][j - a[i - 1]];
                }
            }
        }
        return dp[n][sum];
    }

    public static void main(String[] args) {
        int n = 4;
        int a[] = {3, 3, 3, 3};
        int sum = 6;

        System.out.print(subsetSum(a, n, sum));
    }
}

