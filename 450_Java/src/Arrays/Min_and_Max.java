package Arrays;

import java.util.Arrays;

public class Min_and_Max {
    public static void minmax(int arr[]) {//  Approach -1
        // using linear comparison  Time complexity(o(2(n)) = o(n)
        int min = arr[0];
        int max = arr[0];
        int len = arr.length;


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("The minimum value is : " + min);
        System.out.println("The maximum value is : " + max);
      /*Aprroach -2
        //Sort the array and then print the vallue
        Arrays.sort(arr);

        System.out.println("Min value"+arr[0]);
        System.out.println("Max value "+arr[arr.length-1]);*/

    }

    public static void main(String[] args) {
        int arr[] = new int[]{4, 5, 1, 2, 8, 9};
        minmax(arr);
    }
}
