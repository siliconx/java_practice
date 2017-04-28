import java.util.Scanner;

/**
 * Created by island on 17-4-8.
 */
public class SortedBinaryTree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BinaryTree root = null;
        for (int i=0;i<6;i++) {
            root = insert(root, in.nextInt());
        }
        output(root);
    }

    public static BinaryTree insert(BinaryTree node, int value) {
        if (node == null) {
            return new BinaryTree(value);
        }
        if (node.value > value) {
            node.left = insert(node.left, value);
        } else if (node.value < value) {
            node.right = insert(node.right, value);
        }
        return node;
    }

    public static void output(BinaryTree root) {
        if (root == null) {
            return;
        }

        System.out.println(root.value);
        output(root.left);
        output(root.right);
    }
}
