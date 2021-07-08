package Strings;

import java.util.*;

public class first_repeated_word {
    public static String is_repeated(String s) {
        String[] word = s.split(" ");
       /* for(int i =0;i<word.length;i++)
        {
            System.out.println(word[i]);
        }*/
      /*  HashMap<String,Integer> set_of_words = new HashMap<String,Integer>();
        for(int i =0;i<word.length;i++)
        {
            if(set_of_words.containsKey(word[i]))
                set_of_words.put(word[i],set_of_words.get(word[i])+1);
            else
                set_of_words.put(word[i],1);
        }
        for(int i =0;i<word.length;i++)
        {
            int count = set_of_words.get(word[i]);
            if(count >1)
            {  return word[i];}
        }*/
        HashSet<String> set = new HashSet<String>();
        for (int i = 0; i < word.length; i++) {
            if (set.contains(word[i])) {
                return word[i];
            }
            set.add(word[i]);


        }
        return "No repetation";


    }

    public static void main(String[] args) {
        String s = "Ravi had been saying that he had been there";
        System.out.println(is_repeated(s));
    }
}
