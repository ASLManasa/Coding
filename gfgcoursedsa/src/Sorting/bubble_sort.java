/* time complexity : o(n^2)
space complexity : o(1)
 */
package Sorting;

public class bubble_sort
{
    public static void bubble(int arr[])
    {
        int n = arr.length;
        int temp;
        for(int i =0 ;i< arr.length;i++) {
            for (int j = i + 1; j < arr.length ; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public static void main(String [] args) {
        int arr[] = new int[]{12, 11, 13, 5, 6};
        bubble(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
