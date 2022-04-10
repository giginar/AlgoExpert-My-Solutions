package medium;

public class InvertBinaryTree {
//    Write a function that takes in a Binary Tree and inverts it. In other words,
//    the function should swap every left node int the tree for its corresponding right node.
public static void invertBinaryTree(BinaryTree tree) {
    if(tree == null){
        return;
    }
    BinaryTree rightTree = tree.right;
    BinaryTree leftTree = tree.left;

    tree.right = leftTree;
    tree.left = rightTree;


    invertBinaryTree(tree.left);
    invertBinaryTree(tree.right);
}

    static class BinaryTree {
        public int value;
        public BinaryTree left;
        public BinaryTree right;

        public BinaryTree(int value) {
            this.value = value;
        }
    }
}
