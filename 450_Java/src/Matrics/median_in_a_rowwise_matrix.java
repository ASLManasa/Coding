package Matrics;

public class median_in_a_rowwise_matrix {
    public static int median(int matrix[][]) {
        // int median_val = 0;
        int min = matrix[0][0];
        int max = matrix[0][0];
        int c = matrix[0].length;
        int r = matrix.length;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][0] < min)
                min = matrix[i][0];
            if (matrix[i][c - 1] > max)
                max = matrix[i][c - 1];
        }

        // System.out.print(min+"   "+ max);
        int value = (r * c + 1) / 2;

        while (min < max) {
            int mid = min + max / 2;
            int count = 0;
            for (int i = 0; i < r; i++)

                for (int j = 0; j < c; j++)

                    if (matrix[i][j] < mid)
                        count++;
            if (count < value)
                min = mid + 1;
            else
                max = mid;

        }


        return min;
    }

    public static void main(String[] args) {
        int matrix[][] = {{1, 3, 5}, {2, 6, 9}, {3, 6, 9}};
        median(matrix);
    }
}
