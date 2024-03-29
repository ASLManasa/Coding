/* The program will find the first non-repeating character in the string if it is present in the string */
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class first_non_repeating_charachters {
    public static void non_repeating(String s) {
        int frequency_of_char[] = new int[256];
        //creating an array that calculates the frequency of all the charachter in the string
        for (int i = 0; i < s.length(); i++)
            frequency_of_char[(int) s.charAt(i)]++;
        //calculating the frequency of the char
        for (int j = 0; j < 256; j++) {
            if (frequency_of_char[j] == 1)
            //if the frequency of a char is 1 then print and stop the loop.
            {
                System.out.println("The first non repeating charachter is  : " + (char) j);
                break;
            }
        }


    }

    public static void main(String[] args) {
        System.out.println("Enter the String: ");
        Scanner sc = new Scanner(System.in);
        //creating a scanner object
        String s = sc.next().toLowerCase(Locale.ROOT).trim();
        //taking a string input and converting into lower case and removing trailing and leading spaces
        non_repeating(s);
        //calling the function and passing string s through it
    }
}
/*
Test cases:
1st testcase
input: madam
output: The first non repeating charachter is  :   d

2nd testcase
input: apple
output: The first non repeating charachter is  :   a

space complexity = o(n)
time complexity = o(1)


 */