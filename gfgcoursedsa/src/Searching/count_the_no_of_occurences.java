package Searching;

public class count_the_no_of_occurences
{
    public static void main(String [] args)
    {
        int arr[] = new int[]{1, 1, 2, 2, 2, 2, 3};
        int x = 2;
        int count =0;
        for(int i =0;i< arr.length;i++)
        {
            if(arr[i] == x)
                count++;

        }
        System.out.println(count);
    }
}
