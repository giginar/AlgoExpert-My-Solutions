package easy;

public class NodeDepths {
    //The distance between a node in a Binary Tree and the tree's root is called the node's depth.
    //Write a function that takes in a Binary Tree and returns the sum of its nodes' depths.

    public static int nodeDepths(BinaryTree root) {
        int depth = 0;

        return calculateDepth(root,depth);
    }

    static class BinaryTree {
        int value;
        BinaryTree left;
        BinaryTree right;

        public BinaryTree(int value) {
            this.value = value;
            left = null;
            right = null;
        }
    }

    public static int calculateDepth(BinaryTree root, int depth){
        if (root == null){
            return 0;
        }
        return depth + calculateDepth(root.left, depth + 1) + calculateDepth(root.right, depth + 1);
    }
}
