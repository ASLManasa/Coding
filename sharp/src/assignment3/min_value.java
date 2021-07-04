package assignment3;

public class min_value {
    public static void main(String[] args) {
        int arr[] = {1, 5, 6, 2, 4};
        int n = arr.length;
        /* Approach -1
        Arrays.sort(arr);
        System.out.println(arr[0]);
        */
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
        }
        System.out.println(min);
    }

}
