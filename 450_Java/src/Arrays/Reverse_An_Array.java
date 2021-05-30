package Arrays;

public class Reverse_An_Array {
    public static void main(String[] args) {
        int arr[] = new int[]{1, 2, 3};
        /*Approach -1
        printing the reverse of the array
        for(int i = arr.length -1;i >=0;i--)
        {
            System.out.print(arr[i] +" ");
        }
        */
        /* Approach 2
        using temp array space complexity = o(arr.length) time complexity = 0(n)
        int rev[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {

            rev[i] = arr[arr.length - 1 - i];

        }
        for (int i = 0; i < rev.length; i++) {
            System.out.print(rev[i] + " ");
        }*/
        /*Approach -3
        * two pointer approach */
        int start =0;
        int temp;
        int end =arr.length-1;
        while (start <end)
        {
            temp = arr[start];
            arr[start] =arr[end];
            arr[end] = temp;
            start++;
            end--;

        }
        for(int i =0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }


    }
}
