package Strings;

import javax.swing.plaf.SliderUI;

public class Palindrome
{
    public static boolean ispalindrome(String S)
    {
       int i =0;
       int j = S.length() -1;
       while (i <=j) {
           if (S.charAt(i) != S.charAt(j))
           { return false;}
           else {
               i++;
               j--;
           }
       }

return true;
    }
    public static void main(String [] args)
    {
        String s = "abba";
        System.out.print(ispalindrome(s));
    }
}
