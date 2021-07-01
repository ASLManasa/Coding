package assignment2;

public class continue_4 {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            if (i % 4 == 0)
                continue;
            System.out.print(i + " ");
        }
    }
}
