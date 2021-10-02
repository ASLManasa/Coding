package Trees;

import java.util.Optional;
import java.util.Stack;

class Nodes {
    int data;
    Nodes left;
    Nodes right;

    public Nodes(int key) {
        data = key;
        left = right = null;
    }
}

public class PreOrderInversion {
    public static void preorder(Nodes root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void Ipreorder(Nodes root) {
        Stack<Nodes> s = new Stack<>();
//        Nodes curr = root;
        s.push(root);
        while (!s.isEmpty()) {
            Nodes curr = s.pop();

            System.out.print(curr.data + " ");
            if (curr.right != null) {
                s.push(curr.right);
            }
            if (curr.left != null) {
                s.push(curr.left);
            }

        }

    }

    public static void postorder(Nodes root) {
        if (root == null) {
            return;
        }

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    public static void Ipostorder(Nodes root) {
        Stack<Nodes> stack = new Stack();
        stack.push(root);

        // create another stack to store postorder traversal
        Stack<Integer> out = new Stack();

        // loop till stack is empty
        while (!stack.empty()) {
            // pop a node from the stack and push the data into the output stack
            Nodes curr = stack.pop();
            out.push(curr.data);

            // push the left and right child of the popped node into the stack
            if (curr.left != null) {
                stack.push(curr.left);
            }

            if (curr.right != null) {
                stack.push(curr.right);
            }
        }

        // print postorder traversal
        while (!out.empty()) {
            System.out.print(out.pop() + " ");
        }

    }

    public static void main(String[] args) {
        Nodes root = new Nodes(1);
        root.left = new Nodes(2);
        root.right = new Nodes(3);
        root.left.left = new Nodes(4);
        root.right.left = new Nodes(5);
        root.right.right = new Nodes(6);
        root.right.left.left = new Nodes(7);
        root.right.left.right = new Nodes(8);

        System.out.println("Recursive Preorder");
        preorder(root);
        System.out.println(" ");
        System.out.println("Iterative Preorder");
        Ipreorder(root);
        System.out.println(" ");
        System.out.println("Recursive PostOrder");
        postorder(root);
        System.out.println(" ");
        System.out.println("Iterative PostOrder");
        Ipostorder(root);
    }
}
