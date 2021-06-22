package Matrics;

public class row_with_max_ones {
    public static int max_one(int matrix[][]) {
        int r = matrix.length;
        int c = matrix[0].length;
        /* Approach -1
        int i = 0;
        int j = 0;
        int max = 0;
        int row = 0;
        int count = 0;
        while (i < r && j < c) {
            if (matrix[i][j] == 1)
                count++;
            if (count > max)
                max = count;
            row = i;
        }*/
/* Another approch is to find the first 1 that is occured and return the one that occurs first Time Compexity : o(nlogn)*/
        /*most optlmal approach o(r+c)
         */
        if(r ==0) return 0;

        int i = 0;
        int j = c-1;
        int row = -1;

        while(i<r && j>=0){
            if(matrix[i][j] == 1 ){
                row = i;
                j--;
            }
            else{
                i++;
            }
        }
        return row;

    }

    public static void main(String[] args) {
        int matrix[][] = {{0, 1, 1, 1},
                {0, 0, 1, 1},
                {1, 1, 1, 1},
                {0, 0, 0, 0}};
       System.out.print(max_one(matrix));
    }
}
