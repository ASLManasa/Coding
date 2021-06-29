package Strings;

import java.util.Stack;

public class balanced_parenthis
{
    public static boolean is_balanced(String s)
    {
        if(s.length()%2 ==1)
        {
            return false;
        }
        else {
            Stack<Character> st = new Stack<>();
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '{' || s.charAt(i) == '(' || s.charAt(i) == '[') {
                    st.push(s.charAt(i));
                } else if (!st.isEmpty() && s.charAt(i) == '}' && st.peek() == '{') {
                    st.pop();
                } else if (!st.isEmpty() && s.charAt(i) == ']' && st.peek() == '[') {
                    st.pop();
                } else if (!st.isEmpty() && s.charAt(i) == ')' && st.peek() == '(') {
                    st.pop();
                } else {
                    return false;
                }
            }

            return st.isEmpty();
        }
    }
    public static void main(String [] args)
    {
        String expr = "([{])";
        System.out.println(is_balanced(expr));

    }
}
