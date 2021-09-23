package DynamicProgramming;

public class EqualPartition {
    public static boolean isSubset(int set[], int n, int sum) {

        if (sum == 0)
            return true;
        if (n == 0)
            return false;


        if (set[n - 1] > sum)
            return isSubset(set, n - 1, sum);


        return isSubset(set, n - 1, sum)
                || isSubset(set, n - 1, sum - set[n - 1]);
    }

    public static boolean findPartition(int arr[], int n) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        if (sum % 2 != 0)
            return false;

        return isSubset(arr, n, sum / 2);
    }

    public static void main(String[] args) {
        int arr[] = {3, 1, 5, 9, 12};
        int n = arr.length;

        // Function call
        if (findPartition(arr, n) == true)
            System.out.println("Can be divided into two "
                    + "subsets of equal sum");
        else
            System.out.println(
                    "Can not be divided into "
                            + "two subsets of equal sum");
    }
}
