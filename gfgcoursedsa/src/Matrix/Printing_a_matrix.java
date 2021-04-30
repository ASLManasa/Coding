package Matrix;

import java.util.Scanner;

public class Printing_a_matrix
{
    public static void main(String [] args)
    {
        int matrix[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values:  ");
        for (int i =0;i<matrix.length;i++)
        {
            for(int j =0 ;j< matrix.length;j++)
            {
                matrix[i][j] = sc.nextInt();
            }
        }
        for (int i =0;i<matrix.length;i++)
        {
            for(int j =0 ;j< matrix[i].length;j++)
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}
