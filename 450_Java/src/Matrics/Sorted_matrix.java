package Matrics;
import java.util.*;

public class Sorted_matrix {
    public static void sort(int Mat[][])
    {
        int[] temp = new int[Mat.length * Mat.length];
        int k = 0;
        for (int i = 0; i < Mat.length; i++) {
            for (int j = 0; j < Mat[0].length; j++) {
                temp[k++] = Mat[i][j];
            }
        }
        Arrays.sort(temp);
        k = 0;
        for (int i = 0; i < Mat.length; i++) {
            for (int j = 0; j < Mat[0].length; j++) {
                Mat[i][j] = temp[k++];
                System.out.print(Mat[i][j] + " ");
            }
            System.out.println();
        }

    }
    public static void main(String [] args)
    {
        int mat [][]= {{1,5,3},{2,8,7},{4,6,9}};
        sort(mat);
    }
}
