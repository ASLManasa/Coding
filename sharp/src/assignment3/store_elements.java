package assignment3;

public class store_elements {
    public static void main(String[] args) {
        int arr[] = new int[10];
        int j = 0;

        for (int i = 0; i < 20; i++) {
            if (i % 2 != 0) {
                arr[j] = i;
                j++;
                if (j >= 10)
                    break;
            }
        }
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
    }

}
