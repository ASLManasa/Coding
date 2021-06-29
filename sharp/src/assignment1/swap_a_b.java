package assignment1;

public class swap_a_b {
    public static void main(String[] args) {
        int a, b, temp;
        a = 4;
        b = 8;
        System.out.println("before swapping numbers: " + a + "  " + b);
        /*swapping Approach -1
        temp = a;
        a = b;
        b = temp;*/
        /*Approach -2*/
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swapping: " + a + "   " + b);
        System.out.println();
    }
}
