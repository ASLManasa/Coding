package Arrays;
import java.util.*;
/* Time Complexity :o(nlogn)*/
/*if not sort ot will be o(n^2)*/

public class n_by_k_times {
    public static void find(int arr[], int value) {
        Arrays.sort(arr);
        int freq[] = new int[arr.length];
        int visited = -1;
        for (int i = 0; i < arr.length; i++) {
            int count = 1;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    count++;
                freq[j] = visited;
            }
            if (freq[i] != visited) {
                freq[i] = count;
            }
        }
        for(int i =0;i< freq.length;i++)
        {
            if(freq[i] >= value && freq[i]!= visited)
                System.out.println(arr[i]);

        }
    }

    public static void main(String[] args) {
        int arr[] = new int[]{4, 5, 6, 7, 8, 4, 4};
        int n = arr.length;
        int k = 3;
        int value = n / k;
        //System.out.println(value);
        find(arr, value);
    }
}
