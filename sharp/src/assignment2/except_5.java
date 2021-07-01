package assignment2;

public class except_5 {
    public static void main(String[] args) {
        int counter = 1;
        while (counter <= 100) {
            if (counter % 5 == 0) {
                counter++;
                continue;
            }
            System.out.print(counter + " ");
            counter++;
        }
    }
}
