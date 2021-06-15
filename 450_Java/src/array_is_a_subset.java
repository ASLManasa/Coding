import java.util.HashSet;

public class array_is_a_subset {

    public static boolean subarray(int a1[], int a2[]) {
        /*Approach -1 using hashmap*/
        HashSet<Integer> hash = new HashSet<>();
        for (int i = 0; i < a1.length; i++) {
            hash.add(a1[i]);
        }
        for (int j = 0; j < a2.length; j++) {
            if (!hash.contains(a2[j]))
                return false;
        }


        return true;
    }
/*Approach -2 using binary search*/
    public static void main(String[] args) {
        int a1[] = new int[]{11, 1, 13, 21, 3, 7};
        int a2[] = new int[]{11, 3, 7, 1};
        System.out.println(subarray(a1, a2));
    }
}
