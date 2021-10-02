package DynamicProgramming;

public class LongestPalindromicSubsequence {
    public static int lcs_topdown(char[] X, char[] Y, int m, int n, String s1, String s2) {


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

//    public static int dyamicp_method(char arr[], int i, int j) {
//        if (i == j)
//            return 1;
//        if (arr[i] == arr[j] && i + 1 == j) {
//            return 2;
//        }
//
//        if (arr[i] == arr[j])
//            return dyamicp_method(arr, i + 1, j - 1) + 2;
//
//
//        // If the first and last characters do not match
//        return Math.max(dyamicp_method(arr, i, j - 1), dyamicp_method(arr, i + 1, j));
//
//
//    }

    public static void main(String[] args) {
        String s1 = "GEEKSFORGEEKS";
        char[] X = s1.toCharArray();
        char[] Y = new char[X.length];
        for (int i = X.length - 1; i >= 0; i--)
            Y[X.length - i - 1] = X[i];
        String s2 = Y.toString();

        int m = X.length;
        int n = Y.length;
        System.out.println(lcs_topdown(X, Y, m, n, s1, s2));
//        System.out.println(dyamicp_method(X, 0, s1.length()));
    }
}
