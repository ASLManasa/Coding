package Trie;

//Search happens in O(m) time
public class implementTrie {
    //Alphabet size
    static final int ALPHABET_SIZE = 26;

    //to create new nodes
    static class TrieNode {
        //store the alphabets in the array
        TrieNode children[] = new TrieNode[ALPHABET_SIZE];
        //to check if that is end of the word
        boolean isEndWords;

        //constructor ,intially all values are null;
        TrieNode() {
            isEndWords = false;
            for (int i = 0; i < ALPHABET_SIZE; i++)
                children[i] = null;
        }

    }

    static TrieNode root;

    static void insert(String s) {
        int length = s.length();
        TrieNode current = root;
        //intially pointing to dummy node
        for (int i = 0; i < length; i++) {
            // let index be this value
            int index = s.charAt(i) - 'a';
            //if the char is not present create a new node
            if (current.children[index] == null)
                current.children[index] = new TrieNode();
//            else move to that node
            current = current.children[index];
        }
        //mark ad end of the word
        current.isEndWords = true;
    }

    public static void insertword(TrieNode root, String s) {
        int length = s.length();
        TrieNode current = root;
        //intially pointing to dummy node
        for (int i = 0; i < length; i++) {
            // let index be this value
            int index = s.charAt(i) - 'a';
            //if the char is not present create a new node
            if (current.children[index] == null)
                current.children[index] = new TrieNode();
//            else move to that node
            current = current.children[index];
        }
        //mark ad end of the word
        current.isEndWords = true;

    }

    public static boolean wordBreak(String str, TrieNode root) {
        int size = str.length();
        if (root == null)
            return true;
        for (int i = 1; i <= str.length(); i++) {
            if (search(root, str.substring(0, i)) &&
                    wordBreak(str.substring(i, size), root))
                return true;
                return true;
        }

        return false;
    }

    static boolean search(TrieNode root,String s) {
        int length = s.length();
        TrieNode current = root;
        for (int i = 0; i < length; i++) {
            int index = s.charAt(i) - 'a';
            if (current.children[index] == null)
                return false;
            current = current.children[index];
        }
        return (root != null && current.isEndWords);


    }

    public static void main(String[] args) {
//        String keys[] = {"the", "a", "there", "answer", "any",
//                "by", "bye", "their"};
//
//        String output[] = {"Not present in trie", "Present in trie"};
//
//
//       //dummy node to start traversing
//        root = new TrieNode();
//
//        // Construct trie
//        int i;
//        for (i = 0; i < keys.length; i++)
//            insert(keys[i]);
//
//        if (search("the") == true)
//            System.out.println("the --- " + output[1]);
//        else System.out.println("the --- " + output[0]);

        String dictionary[] = {"mobile", "samsung",
                "sam", "sung", "ma",
                "mango", "icecream",
                "and", "go", "i", "like",
                "ice", "cream"};

        int n = dictionary.length;
        TrieNode root = new TrieNode();

        // Construct trie
        for (int k = 0; k < n; k++)
            insertword(root, dictionary[k]);

        System.out.print(wordBreak("ilikesamsung", root) ?
                "Yes\n" : "No\n");
    }

}
