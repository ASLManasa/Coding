package Matrix;

public class Reversing_a_matrix_90deg_anticockwise
{
    public static void anti90(int matrix[][])
    {
        int temp[][] = new int[3][3];
        for(int i =0;i<matrix.length;i++)
        {
            for(int j =0;j<matrix[i].length;j++)
            {
                temp[i][j] = matrix[j][i];
            }
        }
        System.out.println("Transpose of matrix 1");
        for(int i =0;i< matrix.length;i++)
        {
            for (int j =0 ;j<matrix[i].length;j++)
            {
                System.out.print(temp[i][j]  + "  ");
            }
            System.out.println( );
        }
        for(int i =0 ;i<matrix.length;i++)
        {
            for(int  j =0;j< matrix[i].length;j++)
            {
                matrix[i][j] = temp[i][matrix.length-j-1];            }
        }
        System.out.println("Rotated Matrix");
        for(int i =0;i< matrix.length;i++)
        {
            for (int j =0 ;j<matrix[i].length;j++)
            {
                System.out.print(matrix[i][j]  + "  ");
            }
            System.out.println( );
        }
    }
    public static void main(String [] args)
    {
        int matrix [][] = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("Matrix1");
        for(int i =0;i< matrix.length;i++)
        {
            for (int j =0 ;j<matrix[i].length;j++)
            {
                System.out.print(matrix[i][j]  + "  ");
            }
            System.out.println( );
        }
anti90(matrix);
    }
}
