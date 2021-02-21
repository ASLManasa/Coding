import java.util.Locale;
import java.util.Scanner;

public class stringbasic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        Boolean ans = s1.equalsIgnoreCase(s2);
        System.out.println("Both the Strings are equal?: "+ans);
        int out = s1.compareTo(s2);
        System.out.println("Compare the Strings by ascii value: "+out);
        String lower = s1.toLowerCase();
        System.out.println("Convert into lower case: "+lower);
        String trimming = s1.trim();
        System.out.println("Trimming the spaces: "+trimming);
        String s3 = s1.replace("a", "b");
        System.out.println("Replace a with b: "+ s3);
        String s4 = s3.substring(1, 3);
        System.out.println("Substring of the String: "+s4);
    }
}
