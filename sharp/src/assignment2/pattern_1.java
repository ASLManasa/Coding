package assignment2;

import static java.lang.System.*;

public class pattern_1 {
    public static void main(String[] args) {
        int n = 5;
        int i = n;
        int j = 0;
        while (i > 0) {
            j = 0;
            while (j++ < i) {
                System.out.print("*");
            }
            System.out.println();
            i--;
        }
    }
}
