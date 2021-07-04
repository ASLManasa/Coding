package assignment3;

public class Store_prime_numbers {
    public static void main(String[] args) {
        int arr[] = new int[20];
        int count = 0;
        int n = 2;
        while (count < 20) {
            boolean flag = true;
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                arr[count] = n;
                count++;
            }
            n++;
        }
        for(int i: arr)
        {
            System.out.print(i+" ");
        }

    }
}
