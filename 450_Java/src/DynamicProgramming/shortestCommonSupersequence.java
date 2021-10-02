package DynamicProgramming;

public class shortestCommonSupersequence
{
    public static int lcs_topdown(char[] X, char[] Y, int m, int n,String s1,String s2) {
String s3 = s1.concat(s2);
int len = s3.length();

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
        return len-dp[m][n];


    }
    public static void main(String [] args)
    {
        String s1 = "AGGTAB";
        String s2 = "GXTXAYB";

        char[] X = s1.toCharArray();
        char[] Y = s2.toCharArray();
        int m = X.length;
        int n = Y.length;


        System.out.println(lcs_topdown(X, Y, m, n,s1,s2));
    }
}
