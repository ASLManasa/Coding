package Arrays;

public class Minimum_no_of_operations_to_a_palindrome {
    public static boolean palind(int val){
   /* int reverse =0;
    while(val!= 0)
    {
        int rem = val%10;
        reverse = reverse*10+rem;
        val = val/10;
    }
    System.out.print(val);
        return false;*/
        String str = "" + val;
        int len = str.length();
        for (int i = 0; i < len / 2; i++) {
            if (str.charAt(i) != str.charAt(len - 1 - i))
                return false;
        }
        return true;

    }

    public static boolean palindrome(int[] a) {
        for (int i = 0; i < a.length; i++) {
            boolean ans = palind(a[i]);
            if (ans == false)
                return false;

        }


        return true;
    }

    public static void main(String[] args) {
        int a[] = {111, 222, 333, 444, 555};
       boolean res = palindrome(a);
       if(res == true)
           System.out.print("yes");
       else
           System.out.print("No");
}
}
