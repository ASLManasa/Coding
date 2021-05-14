package Hashing;

import java.util.Optional;

public class no_of_digits
{
    public static int digits(int x)
    {
        if (x<10)
            return 1;
        else
            return 1+digits(x/10);

    }
    public static void main(String [] args)
    {
        int x = 1234;
        System.out.println(digits(x));

    }
}
