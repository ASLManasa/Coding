package assignment2;

public class pattern_4 {
    public static void main(String[] args) {

        int i = 0;
        while (i <= 5) {
            for (int j = 0; j <= i; j++) {
                System.out.print('*');
            }
            for (int j = i; j < 5; j++) {
                System.out.print(' ');
            }
            for (int j = 0; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println();
            i++;

        }
    }
}

