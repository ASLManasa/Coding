package assignment2;

public class patterns_diff {
    public static void pyramid() {
        for (int i = 0; i < 5; i++) //outer loop for number of rows(n) { for (int j=n-i; j>1; j--) //inner loop for spaces
        {
            System.out.print(" "); //print space
        }
        int i = 0;
        for (int j = 0; j <= i; j++) //inner loop for number of columns
        {
            System.out.print("* "); //print star
        }

        System.out.println(); //ending line after each row
    }




    public static void main(String[] args) {
        int n = 5;
        System.out.println("This is a pyramid using *");
        pyramid();
    }
}
