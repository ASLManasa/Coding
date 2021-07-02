package assignment2;

public class pattern_complex
{
    public static void main(String [] args)
    {/*
    output:
     *        *
     **      **
     ***    ***
     ****  ****
     **********

     */
        for(int i =0;i<5;i++)
        {
            for(int j =0;j<=i;j++)
            {
                System.out.print("*");
            }
            for(int j =0;j<4-i;j++)
            {
                System.out.print(" ");
            }
            for(int j =0;j<4-i;j++)
            {
                System.out.print(" ");
            }
            for(int j =0;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
