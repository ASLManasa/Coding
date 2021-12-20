package Arrys;
//Time Complexity : O(n)
//Space Complexity :o(1)

public class Rearrange_array {
    public static void rearrange(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 1; j < n - i - 1; j++) {
                if (arr[i] > arr[j+1]) {
                    int temp = arr[i];
                    arr[i] = arr[j+1];
                    arr[j+1] = temp;
                }
            }

        }
        int index =0;
//        for (int k = 0; k < arr.length ; k++) {
//            System.out.print(arr[k]+" ");
//        }
        for (int k = 0; k < arr.length ; k++) {
           if(arr[k] <0)
               index = k;

        }
//        System.out.println(index+1);
        int neg =0; int pos = index+1;
        while (neg< arr.length && pos < arr.length && arr[neg] <0)
        {
            if(pos == neg)
                break;
            int temprary = arr[pos];
            arr[pos] = arr[neg] ;
            arr[neg] = temprary;
            pos++;
            neg = neg+2;
        }
        for(int k = 0; k < arr.length ; k++) {
            System.out.print(arr[k]+" ");
        }

    }


    public static void main(String[] args) {
        int arr[] = new int[]{1, 2, 3, -4, -1, 4};
        rearrange(arr);
    }
}
