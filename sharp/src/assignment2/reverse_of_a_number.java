package assignment2;

public class reverse_of_a_number {
    public static void main(String[] args) {
        int n = 123;
        int val = 0;
        int rev = 0;
        while (n > 0) {
            val = n % 10;
            // System.out.print(val);
            rev = rev * 10 + val;
            n = n / 10;
        }
        System.out.print(rev);
    }
}
