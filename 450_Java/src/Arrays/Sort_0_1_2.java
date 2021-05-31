package Arrays;

public class Sort_0_1_2 {
    public static void sort012(int arr[]) {/* approach -1 sorting */
        /*approach -2 counting algo*/
        /*Dutch National flag Algorithm
        Time complexity o(n)
         */

        int low = 0;
        int mid = 0;
        int high = arr.length - 1;
        int temp = 0;
        while (mid <= high) {
            switch (arr[mid]) {
                case 0: {
                    //swap low and mid
                    temp = arr[low];
                    arr[low] = arr[mid];
                    arr[mid] = temp;
                    mid++;
                    low++;
                    break;
                }
                case 1: {
                    mid++;
                    break;
                }
                case 2: {
                    //swap mid and high
                    temp = arr[mid];
                    arr[mid] = arr[high];
                    arr[high] = temp;
                    high--;
                    break;
                }
            }
        }
        for (int i =0;i< arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }

    public static void main(String[] args) {
        int arr[] = new int[]{0, 2, 1, 2, 0};
        sort012(arr);
    }
}
