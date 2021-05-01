package Matrix;

public class Reversing_a_matrix_90deg_anticockwise
{
    public static void anti90(int matrix[][])
    {
        int temp[][] = new int[4][4];
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
                matrix[i][j] = temp[matrix.length-i-1][j];
            }
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
        int matrix [][] = new int[][]{{4,8,12,16},{3,7,11,12},{2,6,10,14},{1,5,9,13}};
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
