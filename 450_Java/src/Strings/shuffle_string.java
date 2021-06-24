package Strings;
import java.util.*;
/*  Approach -1 : first check the length and then check if  the elements are present in the  result string*/

public class shuffle_string {
    public static String Sort(String s) {
        char ch[] = s.toCharArray();
        Arrays.sort(ch);
        String str = ch.toString();
        return str;

    }

    public static boolean isshuffe(String s1, String s2, String s3) {
        int length = s1.length() + s2.length();
        if (s3.length() != length)
            return false;
        int i = 0;
        int j = 0;
        int k = 0;
        s1 = Sort(s1);
        s2 = Sort(s2);
        s3 = Sort(s3);
        while (k != length) {
            if (i < s1.length() && s1.charAt(i) == s3.charAt(i))
                i++;
            else if (j < s2.length() && s2.charAt(j) == s3.charAt(j))
                j++;
            else
                return false;
            k++;
        }

        return true;
    }

    public static void main(String[] args) {
        String s1 = "XY";
        String s2 = "12";
        String s3 = "1XY2";
        System.out.print(isshuffe(s1, s2, s3));
    }
}
