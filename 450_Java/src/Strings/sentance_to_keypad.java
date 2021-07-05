package Strings;

public class sentance_to_keypad {
    public static String keypad(String[] arr, String s) {
        String output = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ')
                output = output + "0";
            else {
                int position = s.charAt(i) - 'A';
                // System.out.println(position);
                output = output + arr[position];
            }
        }
        return output;
    }

    public static void main(String[] args) {
        String[] arr = {"2", "22", "222",
                "3", "33", "333",
                "4", "44", "444",
                "5", "55", "555",
                "6", "66", "666",
                "7", "77", "777", "7777",
                "8", "88", "888",
                "9", "99", "999", "9999"};
        String s = "HELLO";
        System.out.println(keypad(arr, s));
        //keypad(arr,s);
    }
}
