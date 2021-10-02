package DynamicProgramming;

public class minimum_insertion_deletion {
    public static void lcs_topdown(char[] X, char[] Y, int m, int n, String s1, String s2) {


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
        int dele = m - dp[m][n];
        int insert = n - dp[m][n];
        System.out.println("deletion: " + dele);
        System.out.println("insertion: " + insert);
    }

    public static void main(String[] args) {
        String s1 = "heap";
        String s2 = "pea";

        char[] X = s1.toCharArray();
        char[] Y = s2.toCharArray();
        int m = X.length;
        int n = Y.length;


        lcs_topdown(X, Y, m, n, s1, s2);
    }
}


