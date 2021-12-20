package Heap;

public class BuildHeap {
    static void heapify(int arr[],int i, int n)
    {
        int largest =i;
        int right = 2*i+1;
        int left = 2*i+2;
        if(left < n && arr[largest] < arr[left])
            largest = left;
        if(right < n && arr[largest] < arr[right])
            largest = right;
        if(largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            heapify(arr, largest, n);
        }


    }
    static void buildHeap(int arr[] ,int n)
    {
        int start = (n/2) -1;
        for(int i = start ;i>=0 ;i--)
            heapify(arr ,i,n);
    }
    static void printHeap(int arr[],int n)
    {
        for(int i =0;i< n;i++)
        {
            System.out.print(arr[i]+" ");
            System.out.println();
        }

    }
    public static void main(String [] args)
    {
        int arr[] = { 1, 3, 5, 4, 6, 13, 10,
                9, 8, 15, 17 };

        int n = arr.length;

        buildHeap(arr, n);

        printHeap(arr, n);
    }

}
