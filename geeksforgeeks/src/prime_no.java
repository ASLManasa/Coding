import java.util.Scanner;

public class prime_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        Boolean flag = false;

        for(int i =2;i<T ;i++)
        {
            if(T%i ==0)
                flag = true;
            break;
        }
        if(T < 2)
            flag = false;

        if(flag == false)
            System.out.println("Is a prime number");
        else
            System.out.println(" Not a prime number");
    }
}
