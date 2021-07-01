package assignment2;

public class digits {
    public static void main(String[] args) {
        int n = 153;
        int val = 0;
        while (n != 0) {
            val = n % 10;
            System.out.println(val);
            n = n / 10;
        }
    }
}
