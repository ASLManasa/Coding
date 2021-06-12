package Arrays;
import java.util.*;

import java.util.Arrays;

public class Subarray_with_0 {
    public static boolean check(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0)
                return true;
        }
        Set<Integer> temp = new HashSet<>();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            temp.add(sum);
            sum += arr[i];
            //System.out.println(temp);
            if (temp.contains(sum)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{4, 2, -3, 1, 6};
       System.out.print( check(arr));
    }
}
