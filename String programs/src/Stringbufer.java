/*  String buffer functionalities */

public class Stringbufer
{
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("string");
        System.out.println(str);

        str.append(" Builder");
        System.out.println(str);
        str.insert(0, "Hi ");
        System.out.println(str);
        str.replace(0, 3, "Hey, ");
        System.out.println(str);
        str.delete(0, 5);
        System.out.println(str);
        str.reverse();
        System.out.println(str);
        System.out.println(str.substring(3,6));


    }

    }

