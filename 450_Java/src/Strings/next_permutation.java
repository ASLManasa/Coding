package Strings;

public class next_permutation
{
    public static void swap(int arr[],int i ,int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void reverse(int arr[] ,int i,int j)
    {
        while (i<j)swap(arr,i++,j--);
    }
    public static void nextpermute(int arr[])
    {
        if(arr == null || arr.length==0)
        {  return ;}
        int i = arr.length-2;
        while (i >=0 && arr[i] >= arr[i+1])i--;
        if(i >=0){
            int j = arr.length-1;
            while (arr[j] <= arr[i]) j--;
            swap(arr,i,j);
        }
        reverse(arr,i+1,arr.length-1);


    }
    public static void main(String [] args)
    {
        int arr [] = {1, 2, 3, 6, 5, 4};
        nextpermute(arr);
        for(int i =0;i< arr.length;i++)
        {
            System.out.print(arr[i]);
        }
    }
}
