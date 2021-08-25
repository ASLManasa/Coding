package Trees;

import java.util.Stack;

class node {
    int data;
    node left;
    node right;

    public node(int key) {
        data = key;
        left = right = null;
    }


}

public class InorderTraversalIteration {
    public static void inorderIterative(node root) {
        Stack<node> s = new Stack<>();

        node current = root;

        while (!s.isEmpty() || current != null) {
            if (current != null) {
                s.push(current);
                current = current.left;
            } else {
                current = s.pop();
                System.out.println(current.data + " ");
                current = current.right;
            }
        }

    }

    public static void main(String[] args) {
        node root = new node(1);
        root.left = new node(2);
        root.right = new node(3);
        root.left.left = new node(4);
        root.right.left = new node(5);
        root.right.right = new node(6);
        root.right.left.left = new node(7);
        root.right.left.right = new node(8);

       inorderIterative(root);
    }
}
