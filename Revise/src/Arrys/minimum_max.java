package Arrys;

public class minimum_max {
    public static void min_max(int arr[], int n) {
        int min = arr[0];
        int max = arr[0];
       for(int i=0;i<arr.length;i++)
       {
           if(arr[i] < min)
               min = arr[i];
       }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] > max)
                max = arr[i];
        }
        System.out.println(min+" ");
        System.out.println(max+" ");


    }

    public static void main(String[] args) {
        int arr[] = {1000, 11, 445, 1, 330, 3000};
        int arr_size = 6;

        min_max(arr, arr_size);


    }
}
