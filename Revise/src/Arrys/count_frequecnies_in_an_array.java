package Arrys;

import java.util.HashMap;
import java.util.Map;

public class count_frequecnies_in_an_array {
    public static void countFreq(int arr[], int n) {
      /*
       Approach -1 o(n^2)
       int freq[] = new int[n];
        int visited = -1;
        int count = 0;
        for (int i = 0; i < n; i++) {
            count = 1;
            int j;
            for (j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    freq[j] = visited;
                }
            }

            if (freq[i] != -1) {
                freq[i] = count;
            }

        }
        System.out.println("---------------------------------------");
        for(int i = 0; i < freq.length; i++){
            if(freq[i] != visited)
                System.out.println("    " + arr[i] + "    |    " + freq[i]);
        }
        System.out.println("----------------------------------------");*/
        Map<Integer,Integer> mp = new HashMap<>() ;
        for (int i = 0; i < n; i++)
        {
            mp.put(arr[i], mp.get(arr[i]) == null ? 1 : mp.get(arr[i]) + 1);
        }


        for (int i = 0; i < n; i++)
        {
            if (mp.get(arr[i]) != -1)
            {
                System.out.println(arr[i] + " " + mp.get(arr[i]));
                mp.put(arr[i], -1);
            }
        }

    }

    public static void main(String[] args) {
        int arr[] = {10, 20, 20, 10, 10, 20, 5, 20};
        int n = arr.length;
        countFreq(arr, n);
    }
}
