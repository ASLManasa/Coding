package Strings;
/* Brute force approach : o^3*/
public class Longest_palindromic_String {
    public static boolean pali(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i < s.length() && j >= 0) {
            if (s.charAt(i) != s.charAt(j))
                return false;
            else {
                i++;
                j--;
            }
        }
        return true;
    }

    public static void palindrome(String str) {
        int max_length = 1;
        String ans = "";
        for (int i = 0; i < str.length(); i++)
            for (int j = i + 1; j <= str.length(); j++) {

                String s = str.substring(i, j);
               // System.out.println(s);
                if (pali(s) == true) {
                    if (max_length < s.length()) {
                        max_length = s.length();
                        ans = s;
                    }
                }
            }

        System.out.println("max_Length : " + max_length);
        System.out.println("String :" + ans);

    }

    public static void main(String[] args) {
        String s = "aaaabbaa";
        palindrome(s);
    }
}
