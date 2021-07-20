import java.util.Scanner;
import java.util.*;

public class sortingAlgoCompare {
    public static void bubbleSort(int arr[]) {
        /*Best tc =o(n), else =o(n^2),sc= o(1)*/
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }
        }
        printArray(arr);
    }

    public static void selectionSort(int arr[]) {
//        Tc : o(n^2)  sc :o(1)
        for (int i = 0; i < arr.length - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;


            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
        printArray(arr);

    }

    public static void insertionSort(int arr[]) {
//        tc :o(n) .othero(n^2) sc =0(1)
        for (int i = 1; i < arr.length; ++i) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        printArray(arr);

    }

    public static int partition(int arr[], int low, int high) {
        int pivot = arr[high];


        int i = (low - 1);


        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {

                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }

        }


        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;


        return (i + 1);
    }
// tc: 0(nlogn) ,  worst(o n^2) ,sc= o(1)
    public static void quickSort(int arr[], int low, int high) {
        if (low < high) {

            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);


            quickSort(arr, pi + 1, high);
        }

    }


    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Bubble Sort");
        long start1 = System.nanoTime();
        bubbleSort(arr);
        long end1 = System.nanoTime();
    System.out.print("Elapsed Time in nano seconds:  " + (end1 - start1));
      System.out.println(" ");
        System.out.println("Selection sort");
        long start2 = System.nanoTime();
        selectionSort(arr);
        long end2 = System.nanoTime();
//        System.out.print("Elapsed Time in nano seconds:  " + (end2 - start2));
        System.out.println("Insertion Sort");
        long start3 = System.nanoTime();
        insertionSort(arr);
        long end3 = System.nanoTime();
//        System.out.println("Elapsed Time in nano seconds:  " + (end3 - start3));
        System.out.println("Quick sort");
        long start4 = System.nanoTime();
        quickSort(arr, 0, arr.length - 1);
        printArray(arr);
        long end4 = System.nanoTime();
//        System.out.println("Elapsed Time in nano seconds:  " + (end4 - start4));

    }
}
