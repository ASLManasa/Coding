package SortingSearching;

public class countSquares {
    public static void main(String[] args) {
        int N = 9;
        int arr[] = {1, 4, 9};
        int count = 0;

        for (int i = 1; i * i < N; i++) {
            count++;
        }
        System.out.println(count);
    }
}
