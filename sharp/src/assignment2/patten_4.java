package assignment2;

public class patten_4 {
    public static void main(String[] args) {
        /*
         *     *
         **    **
         ***   ***
         **** ****
         **********
         */
        for (int i = 0; i <= 10; i++) {

            for (int k = 0; k <= i; k++) {
                int mid = i / 2;
                if (i % 2 == 1)

                    System.out.print("*");

            }
            System.out.println("");
        }


    }


}
