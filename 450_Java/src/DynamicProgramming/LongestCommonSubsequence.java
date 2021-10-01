package DynamicProgramming;

public class LongestCommonSubsequence {
//    time complexity :o(2^n)
    public static int lcs_recursion(char[] X, char[] Y, int m, int n) {

        {
            if (m == 0 || n == 0)
                return 0;
            if (X[m - 1] == Y[n - 1])
                return 1 + lcs_recursion(X, Y, m - 1, n - 1);
            else
                return Math.max(lcs_recursion(X, Y, m, n - 1), lcs_recursion(X, Y, m - 1, n));
        }
    }
//    time complexity:o(mn)

    public static int lcs_topdown(char[] X, char[] Y, int m, int n) {


            int dp[][] = new int[m + 1][n + 1];
            for (int i = 0; i < m; i++)
                dp[i][0] = 0;
            for (int i = 0; i < m; i++)
                dp[0][i] = 0;
            for (int i = 1; i < m + 1; i++) {
                for (int j = 1; j < n + 1; j++) {
                    if (X[i - 1] == Y[j - 1])
                        dp[i][j] = 1 + dp[i - 1][j - 1];
                    else
                        dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);

                }
            }
     return dp[m][n];

    }


    public static void main(String[] args) {
        String s1 = "AGGTAB";
        String s2 = "GXTXAYB";

        char[] X = s1.toCharArray();
        char[] Y = s2.toCharArray();
        int m = X.length;
        int n = Y.length;

        System.out.println(lcs_recursion(X, Y, m, n));
        System.out.println(lcs_topdown(X, Y, m, n));
    }
}
