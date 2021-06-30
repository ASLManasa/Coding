package assignment1;

import java.util.Scanner;


public class greater_of_3 {
    public static void compare3(int a, int b, int c) {
        if (a > b && a > c)
            System.out.print("A is the greater amoong the three");
        else if (b > c)
            System.out.print("B is the greater amoong the three");
        else
            System.out.print("C is the greater amoong the three");


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //taking input as a b c
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        compare3(a, b, c);
    }
}
