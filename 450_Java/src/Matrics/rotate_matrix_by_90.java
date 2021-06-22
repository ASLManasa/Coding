package Matrics;

public class rotate_matrix_by_90 {
    public static void rotate(int mat[][]) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = i; j < mat[0].length; j++) {
                int temp = mat[j][i];
                mat[j][i] = mat[i][j];
                mat[i][j] = temp;
            }
            int k = 0, l = mat[0].length - 1;
            while (k <= l) {
                int temp = mat[i][k];
                mat[i][k] = mat[i][l];
                mat[i][l] = temp;
                k++;
                l--;
            }
        }
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int mat[][] = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        rotate(mat);
    }
}
