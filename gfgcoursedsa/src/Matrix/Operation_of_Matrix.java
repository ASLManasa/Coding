package Matrix;

import java.util.Scanner;

public class Operation_of_Matrix
{
    public static void add(int matrix1[][],int matrix2[][])
    {
        int matrix3 [][] = new int[2][2];
        for(int i =0;i<matrix1.length;i++)
        {
            for(int j =0;j< matrix1[i].length;j++)
            {
                matrix3[i][j] = matrix1[i][j]+matrix2[i][j];
            }
        }
        System.out.println("Sum of matrix 1 and Matrix2  ");
        for(int i =0;i< matrix3.length;i++)
        {
            for(int j =0;j <matrix3[i].length;j++)
            {
                System.out.print(matrix3[i][j] + "  " );
            }
            System.out.println();
        }
    }
    public static void sub(int matrix1[][],int matrix2[][])
    {
        int matrix4 [][] = new int[2][2];
        for(int i =0;i<matrix1.length;i++)
        {
            for(int j =0;j< matrix1[i].length;j++)
            {
                matrix4[i][j] = matrix1[i][j]-matrix2[i][j];
            }
        }
        System.out.println("Subtraction of matrix 1 and Matrix2  ");
        for(int i =0;i< matrix4.length;i++)
        {
            for(int j =0;j <matrix4[i].length;j++)
            {
                System.out.print(matrix4[i][j] + "  " );
            }
            System.out.println();
        }
    }
    public static void main(String [] args)
    {
        int matrix1 [][] = new int[2][2];
        int matrix2 [][] = new int[2][2];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Matrix 1 values :  ");
        for(int i =0;i< matrix1.length;i++)
        {
            for(int j =0;j <matrix1[i].length;j++)
            {
                matrix1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the Matrix 2 values :  ");
        for(int i =0;i< matrix2.length;i++)
        {
            for(int j =0;j <matrix2[i].length;j++)
            {
                matrix2[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix 1:  ");
        for(int i =0;i< matrix1.length;i++)
        {
            for(int j =0;j <matrix1[i].length;j++)
            {
                System.out.print(matrix1[i][j] + "  " );
            }
            System.out.println();
        }
        System.out.println("Matrix 2:  ");
        for(int i =0;i< matrix2.length;i++)
        {
            for(int j =0;j <matrix2[i].length;j++)
            {
                System.out.print(matrix2[i][j] + "  ");

            }
            System.out.println();
        }
        add(matrix1,matrix2);
        sub(matrix1,matrix2);

    }
}
