package assignment2;

public class armstrong_number {
    public static int product(int i) {
        int ans = 0;
        int val = 0;
        while (i > 0) {
            val = i % 10;
            ans = ans+ val*val*val;
            i = i / 10;

        }
        return ans;

    }

    public static void main(String[] args) {
        int i = 1;

        while (i < 1000) {
            if(i == product(i))
            {
                System.out.println(i+" ");
            }
            i++;

        }
    }
}
