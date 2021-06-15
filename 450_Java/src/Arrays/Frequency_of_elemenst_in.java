package Arrays;

import java.util.*;

public class Frequency_of_elemenst_in {
    public static void frequency(int arr[]) {
        Arrays.sort(arr);
        int frequ[] = new int[arr.length];
        int visited = -1;

        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    frequ[j] = visited;
                }
            }

            if (frequ[i] != visited)
                frequ[i] = count;

        }
        for(int i = 0; i < frequ.length; i++){
            if(frequ[i] != visited)
                System.out.println("    " + arr[i] + "    |    " + frequ[i]);
        }

    }

    public static void main(String[] args) {
        int arr[] = new int[]{1, 2, 8, 3, 2, 2, 2, 5, 1};
        frequency(arr);
    }
}
