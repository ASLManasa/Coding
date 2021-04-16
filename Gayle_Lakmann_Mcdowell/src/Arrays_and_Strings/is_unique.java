package Arrays_and_Strings;

public class is_unique {
    public static boolean unique(String s) {


        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j))
                    return false;


            }
        }
        return true;
    }


    public static void main(String[] args) {
        String s = "apple";
        Boolean value = unique(s);
        if (value == true) {
            System.out.println(" unique");

        } else {
            System.out.println("not unique");
        }


    }
}
