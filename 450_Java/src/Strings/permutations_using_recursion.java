package Strings;

public class permutations_using_recursion {
    public static void permute(String ques, String asf) {
        if (ques.length() == 0) {
            System.out.println(asf);
            return;
        }
        for (int i = 0; i < ques.length(); i++) {
            char ch = ques.charAt(i);
            String lpart = ques.substring(0, i);
            String rpart = ques.substring(i + 1);
            String roq = lpart + rpart;
            permute(roq, asf + ch);

        }
    }

    public static void main(String[] args) {
        String s = "123";
        permute(s, " ");
    }
}
