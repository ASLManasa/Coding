package Strings;

public class reverse_of_a_string {
    public static void main(String[] args) {
        String s[] = {"h", "e", "l", "l", "o"};
        int start = 0;
        int end = s.length - 1;
        String temp;
        while (start <= end) {
            temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;

        }
        for (String s1 : s) {
            System.out.print(s1 + " ");
        }


    }
}
