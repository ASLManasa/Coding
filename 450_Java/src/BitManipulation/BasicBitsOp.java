package BitManipulation;

public class BasicBitsOp {
    public static boolean getBit(int n, int i) {
        return ((n & (1 << i)) != 0);
    }

    public static int setBit(int n, int i) {
        return (n | (1 << i));
    }

    public static int clearBit(int n, int i) {
        return (n & (~(1 << i)));
    }

    public static int updateBit(int n, int i, int value) {
        int mask = ~(1 << i);
        n = n & mask;
        return (n | (value << i));

    }

    public static void main(String[] args) {
        int n = 5;
        int value = 1;
        System.out.println(getBit(n, 2));
        System.out.println(setBit(n, 1));
        System.out.println(clearBit(n, 2));
        System.out.println(updateBit(n, 1, value));

    }
}
