package Strings;

import java.util.*;

public class isomorphic {
    public static boolean iso(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        if (n != m)
            return false;
       /*  Approach -1 Time Complexity = o(n)
       int count_s1[] = new int[256];
        int count_s2[] = new int[256];
        for (int i = 0; i < n; i++) {
            count_s1[s1.charAt(i)]++;
            count_s2[s2.charAt(i)]++;
            if (count_s1[s1.charAt(i)] != count_s2[s2.charAt(i)]) {
                return false;
            }
        }*/
        /*Another - Approach */

        HashMap<Character, Character> map1 = new HashMap<>();
        HashMap<Character, Boolean> map2 = new HashMap<>();

        int i = 0, j = 0;
        while (i < s1.length() && j < s2.length()) {

            char ch1 = s1.charAt(i);
            char ch2 = s2.charAt(j);
            if (map1.containsKey(ch1)) {
                if (map1.get(ch1) != ch2) {
                    return false;
                }
            } else {
                if (map2.containsKey(ch2)) {
                    return false;
                } else {
                    map1.put(ch1, ch2);
                    map2.put(ch2, true);
                }
            }
            i++;
            j++;
        }
        return true;
    }

    public static void main(String[] args) {
        String s1 = "aab";
        String s2 = "xxy";
        System.out.println(iso(s1, s2));
    }
}
