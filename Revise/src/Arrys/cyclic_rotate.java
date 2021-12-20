package Arrys;

public class cyclic_rotate {
    static void rotate(int arr[], int n)
    {
        int temp =0;
        int i=0;int j=n-1;
        while(i<n-1 && i!=j)
        {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j]=temp;
            i++;

        }
        for(int k=0;k<arr.length;k++)
        {
            System.out.print(arr[k]+" ");
        }

    }
    public static void main(String [] args)
    {
        int arr[] = new int[]{1,2,3,4,5};
        int a =1;
        int n = arr.length;
        rotate(arr,n);
    }
}
