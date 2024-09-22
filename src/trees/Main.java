package trees;

import java.util.ArrayDeque;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);

        System.out.println(maximumInBinaryTreeLevelOrderTraversal(root));
    }

    //O(n)
    public static void inorderTraversal(Node root) {
        if (root != null) {
            inorderTraversal(root.left);
            System.out.println(root.value);
            inorderTraversal(root.right);
        }
    }

    //O(n)
    public static void preorderTraversal(Node root) {
        if (root != null) {
            System.out.println(root.value);
            preorderTraversal(root.left);
            preorderTraversal(root.right);
        }
    }

    //O(n)
    public static int height(Node root) {
        if (root == null) return 0;

        return Math.max(height(root.left), height(root.right)) + 1;
    }

    public static void printNodesAtkDistance(Node root, int k) {
        if (root == null) return;
        if (k == 0) {
            System.out.println(root.value);
        } else {
            printNodesAtkDistance(root.left, k - 1);
            printNodesAtkDistance(root.right, k - 1);
        }
    }


    public static void levelOrderTraversalUsingHeightAndPrintNodesAtKDistance(Node root) {
        if (root == null) return;
        int height = height(root);

        for (int i = 0; i < height; i++) {
            printNodesAtkDistance(root, i);
        }
    }

    public static void levelOrderTraversalUsingQueue(Node root) {
        if (root == null) return;
        Queue<Node> queue = new ArrayDeque<>();

        queue.add(root);

        while (!queue.isEmpty()) {
            Node current = queue.poll();
            System.out.println(current.value);

            if (current.left != null) {
                queue.add(current.left);
            }
            if (current.right != null) {
                queue.add(current.right);
            }
        }
    }

    public static int sizeOfTree(Node root) {
        if (root == null) {
            return 0;
        }

        return 1 + sizeOfTree(root.left) + sizeOfTree(root.right);
    }

    public static int maximumInBinaryTree(Node root) {
        if (root == null) {
            return Integer.MIN_VALUE;
        }
        return Math.max(root.value, Math.max(maximumInBinaryTree(root.left), maximumInBinaryTree(root.right)));
    }

    //should be used with the tree is skewed which is one-sided because then level will only
    // have 1 node at max but recursion will add all the levels in the call stack
    public static int maximumInBinaryTreeLevelOrderTraversal(Node root) {
        if (root == null) {
            return Integer.MIN_VALUE;
        } else {
            Queue<Node> queue = new ArrayDeque<>();
            int result = Integer.MIN_VALUE;

            queue.add(root);

            while (!queue.isEmpty()) {
                Node current = queue.poll();
                result = Math.max(current.value, result);
                if (current.left != null) {
                    queue.add(current.left);
                }
                if (current.right != null) {
                    queue.add(root.right);
                }
            }

            return result;
        }
    }
}


