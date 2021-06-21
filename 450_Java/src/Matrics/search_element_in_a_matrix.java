package Matrics;

import java.util.Scanner;

public class search_element_in_a_matrix {
    public static boolean search(int matrix[][], int n) {
      /* Brute force approach time complexity o(m*n)
     for (int i = 0; i < matrix.length; i++) {
       for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == n)
                    return true;
            }
        }*/
       /* APPROACH -2 OPTIMAL
       int i = 0;
        int j = matrix.length - 1;
        while (i < matrix.length && j > 0) {
            if (matrix[i][j] == n) {
                return true;
            }
            if (matrix[i][j] > n)
                j--;
            else
                i++;

        }*/
        /* Most optimal approach */
        int low =0;
        int high = (matrix.length * matrix[0].length) -1;
        int m = matrix[0].length;
        while(low <= high)
        {
            int mid = (low +(high-low))/2;
            if(matrix[mid/m][mid%m] == n)
            { return true;}
            if(matrix[mid/m][mid%m] < n)
            {low = mid+1;}
            else
            { high = mid-1;}
        }


        return false;
    }

    public static void main(String[] args) {
        int matrix[][] = new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        int n = 3;
        System.out.print(search(matrix, n));
    }
}
