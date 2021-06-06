package Arrays;

import java.util.HashSet;

/* Approach -1  time complexity - o(n+m)*/
public class union_of_2_arrays {
    public static void union(int arr1[], int arr2[]) {
        /*Appproach -1 */
       int i = 0;
        int j = 0;
        int m = arr1.length;
        int n = arr2.length;
        while(i < m && j < n)
        {
            if(arr1[i] < arr2[j]) {
                System.out.print(arr1[i++]+" ");

            }
            else if(arr2[j] < arr1[i]) {
                System.out.print(arr2[j++]+" ");

            }
            else {
                System.out.print(arr2[j++]+" ");
                i++;

            }

        }
        if ( i < m)
            System.out.println(arr1[i++]);
        if ( j < n)
            System.out.println(arr2[j++]);
      /*Approach -2
      HashSet<Integer> union = new HashSet<>();
        for(int i =0 ;i<arr1.length;i++)
        {
            union.add(arr1[i]);
        }
        for(int i =0 ;i<arr2.length;i++)
        {
            union.add(arr2[i]);
        }
        System.out.print(union);*/
    }

    public static void main(String[] args) {
        int arr1[] = new int[]{1, 2, 4, 5, 6};
        int arr2[] = new int[]{2, 3, 5, 7};
        union(arr1, arr2);
    }
}
