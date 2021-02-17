import java.util.Arrays;
import java.util.Scanner;

public class medianmatrix {
    public static void main(String[] args) {
        int arr[][] = new int[2][2];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int matrix[] = new int[4];
        for (int k = 0; k < matrix.length; k++) {
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    matrix[k] = arr[i][j];
                }
            }
        }
       Arrays.sort(matrix);
        int n = matrix.length;
       if(matrix.length %2 ==0)
       {
           System.out.print(matrix[n/2]);
       }
    }
}
