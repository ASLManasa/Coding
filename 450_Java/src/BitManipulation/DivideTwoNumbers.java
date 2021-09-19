package BitManipulation;

public class DivideTwoNumbers {
    public static int divide(int dividend, int divisor) {
        int sign = ((dividend < 0) ^
                (divisor < 0)) ? -1 : 1;

        // Update both divisor and
        // dividend positive
        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);

        // Initialize the quotient
        int quotient = 0;

        while (dividend >= divisor) {
            dividend -= divisor;
            ++quotient;
        }
        //if the sign value computed earlier is -1 then negate the value of quotient
        if (sign == -1) quotient = -quotient;

        return quotient;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        System.out.println(divide(a, b));
    }
}
