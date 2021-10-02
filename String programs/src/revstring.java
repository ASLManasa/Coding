import java.util.Scanner;
import java.util.*;
import java.io.*;

public class revstring {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("First add some characters...");
        char[] a = s.next().toCharArray();
        System.out.println("Elements = ");
        for (int i = 0; i < a.length; i++)
            System.out.println(a[i]);
    }
}
