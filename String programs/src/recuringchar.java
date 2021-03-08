import java.util.Scanner;

public class recuringchar {
    public static String recur(String s) {
        char[] arr1 = s.toCharArray();
        char[] arr2 = new char[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = i + 1; j < arr1.length; j++) {
                for (int k = 0; k < arr2.length; k++) {
                    if (arr1[i] == arr1[j]) {
                        arr2[k] = arr1[j];
                    }
                }
            }
        }
        String valuefinal = arr2.toString();
        return valuefinal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(recur(s));

    }
}
