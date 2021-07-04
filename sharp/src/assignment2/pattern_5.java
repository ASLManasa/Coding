package assignment2;

public class pattern_5 {
    public static void main(String[] args) {
        int i, j;

        i = 1;
        while (i <= 5) {
            j = i;
            while (j <= 5) {  //print upper part of pattern
                System.out.print("*");
                j++;
            }
            i++;
            System.out.print("\n");
        }
        i = 5;
        while (i >= 1) {    //print lower part of pattern
            j = i;
            while (j <= 5) {
                System.out.print("*");
                j++;
            }
            i--;
            System.out.print("\n");
        }
    }
}
