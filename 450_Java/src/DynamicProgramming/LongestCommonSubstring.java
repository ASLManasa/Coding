package DynamicProgramming;

public class LongestCommonSubstring
{
    public static int substring(char X[],char Y[],int m,int n)
    {
        int ans =0;
        int dp[][] = new int[m + 1][n + 1];
        for (int i = 0; i < m; i++)
            dp[i][0] = 0;
        for (int i = 0; i < n; i++)
            dp[0][i] = 0;
        for (int i = 1; i < m + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                if (X[i - 1] == Y[j - 1]) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                    ans = Math.max(dp[i][j], ans);
                }
                else
                    dp[i][j] = 0;

            }
        }
        return ans;

    }


    public static void main(String [] args)
    {
        String X = "abcdxyz";
        String Y = "xyzabcd";

        int m = X.length();
        int n = Y.length();

        System.out.println(substring(X.toCharArray(), Y.toCharArray(), m, n));
    }
}
