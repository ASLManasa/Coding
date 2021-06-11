package Strings;
/*Time Complexity is (o(n)*n!) */
public class Permutations {
    public static String swap(String a, int i, int j) {
        char[] b = a.toCharArray();
        char ch;
        ch = b[i];
        b[i] = b[j];
        b[j] = ch;
        return String.valueOf(b);
    }

    public static void permute(String s1, int low, int high) {
        if (low == high - 1)
            System.out.println(s1);
        for (int i = low; i < high; i++) {
            s1 = swap(s1, low, i);
            permute(s1, low + 1, high);
            //Backtracking
            s1 = swap(s1, low, i);
        }


    }

    public static void main(String[] args) {
        String s1 = "ABC";
        int n = s1.length();
        System.out.println("These are all the permutations");
        permute(s1, 0, n);
    }
}
