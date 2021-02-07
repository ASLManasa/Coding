import java.util.*;
public class consemaxelem
{
    static int findLongestConseqSubseq(int[] arr, int n) {
        Set<Integer> set = new HashSet<>();
        for (int a : arr) set.add(a);
        int max = 0;
        for (int a : arr) {
            if (!set.contains(a - 1)) {
                int count = 0, k = a;
                while (set.contains(k++)) count++;
                max = Math.max(max, count);
            }
        }
        return max;
    }
    public static void main(String [] args)
    {
        int arr [] ={1,9,3,10,4,20,2};
        System.out.println(findLongestConseqSubseq(arr, arr.length));

    }
}
