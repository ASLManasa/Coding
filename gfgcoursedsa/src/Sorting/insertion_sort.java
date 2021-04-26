/* o(n^2) - time complexity
* o(1) - space complexity */
package Sorting;

public class insertion_sort {
    public static void insertion(int arr[]) {
        int n = arr.length;
        int key = 0;
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            key = arr[i];                            /* setting the 1st element as key*/
            j = i - 1;                               /* take j+1 as i*/

            while (j >= 0 && arr[j] > key) {        /*check  if j is>-0 and the element is greater than key then we swap*/
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;                    /*check the same for the next elementc*/


        }

    }

    public static void main(String[] args) {
        int arr[] = new int[]{12, 11, 13, 5, 6};
        insertion(arr);
        for (int i : arr) {
            System.out.println(i);
        }


    }
}
