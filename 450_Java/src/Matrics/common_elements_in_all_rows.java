package Matrics;

import java.util.*;

public class common_elements_in_all_rows {
    public static void common_elements(int mat[][]) {
        Map<Integer, Integer> mp = new HashMap<>();
        // all row elements inseide the hashmap
        for (int i = 0; i < mat[0].length; i++)
            mp.put(mat[0][i], 1);

        for (int i = 1; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mp.get(mat[i][j]) != null && mp.get(mat[i][j]) == i) {
                    mp.put(mat[i][j], i + 1);


                    if (i == mat.length - 1)
                        System.out.print(mat[i][j] + " ");
                }
        }
    }


}

    public static void main(String[] args) {
        int mat[][] =
                {
                        {1, 2, 1, 4, 8},
                        {3, 7, 8, 5, 1},
                        {8, 7, 7, 3, 1},
                        {8, 1, 2, 7, 9},
                };
        common_elements(mat);
    }
}
