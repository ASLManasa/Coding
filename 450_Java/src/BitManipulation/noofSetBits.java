package BitManipulation;

public class noofSetBits {
    public static int countSet(int n) {
        int count = 0;
        while (n != 0) {
            n = n & n - 1;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 19;
        System.out.println(countSet(n));
    }
}
