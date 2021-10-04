package DynamicProgramming;

public class LongestRepeatingSubsequence
{
    public static int longestSubsequence(char x[] ,char y[] ,int m,int n)
    {
        int dp [][] = new int[m+1][n+1];
        for(int i=0;i<m;i++)
            dp[0][i] =0;
        for(int j=0;j<m;j++)
            dp[j][0] =0;
        for (int i = 1; i < m + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                if (x[i - 1] == y[j - 1] && i!=j)
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                else
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);

            }
        }
        return dp[m][n];


    }
public static void main(String [] args)
{
    String s1 = "aabb";
    String s2 = "aabb";

    char[] X = s1.toCharArray();
    char[] Y = s2.toCharArray();
    int m = X.length;
    int n = Y.length;

    System.out.println(longestSubsequence(X, Y, m, n));
}
}
