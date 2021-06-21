package Matrics;
import java.util.*;

public class spiral_matrix {
    public static  List<Integer> spiralOrder(int[][] matrix)
    {
        List<Integer> res = new ArrayList();
        int rowBegin =0;
        int rowEnd = matrix.length-1;
        int columnBegin = 0;
        int columnEnd = matrix[0].length -1;
        if(matrix.length == 0 ) return res;
        while(rowBegin <= rowEnd && columnBegin <=columnEnd)
        {
            for(int i = columnBegin ;i <= columnEnd;i++)
            {
                res.add(matrix[rowBegin][i]);
            }
            rowBegin++;
            for(int i = rowBegin ; i<= rowEnd ;i++)
            {
                res.add(matrix[i][columnEnd]);
            }
            columnEnd--;
            if(rowBegin <= rowEnd)
            {
                for(int i = columnEnd ; i>= columnBegin ;i--)
                {
                    res.add(matrix[rowEnd][i]);
                }
            }
            rowEnd--;
            if(columnBegin <= columnEnd)
            {
                for(int i = rowEnd ; i>= rowBegin ;i--)
                {
                    res.add(matrix[i][columnBegin]);
                }
            }
            columnBegin++;


        }
        return res;

    }

    public static void main(String [] args)
    {
        int [][] matrix = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
       System.out.print(spiralOrder(matrix));
    }
}
