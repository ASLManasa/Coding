package assignment1;

import java.util.Scanner;

public class nested_if {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the distance value: ");
        int d = sc.nextInt();
        /* Approach -1
        if (d <= 100 && d >= 0) {
            System.out.print("cost: 5:00");

        } else if (d > 100 && d <= 500) {
            System.out.print("cost : 8:00");
        } else if (d > 500 && d < 1000) {
            System.out.print("cost : 10:00");
        } else {
            System.out.print("cost : 12:00");
        }*/
        /* Approch -2*/
        if (d <= 500) {
            if (d <= 100 && d >= 0) {
                System.out.print("cost: 5:00");
            } else {
                System.out.print("cost : 8:00");
            }
        } else if (d > 500 && d < 1000) {
            System.out.print("cost : 10:00");
        } else {
            System.out.print("cost : 12:00");


        }

    }
}
