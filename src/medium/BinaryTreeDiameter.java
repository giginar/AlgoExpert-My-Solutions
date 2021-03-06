package medium;

public class BinaryTreeDiameter {
//    Write a function that takes in a Binary Tree and returns its diameter.
//    The diameter of a binary tree is defined as the length of its longest path,
//    even if that path does not pass through the root of the tree.
    static class BinaryTree {
        public int value;
        public BinaryTree left = null;
        public BinaryTree right = null;

        public BinaryTree(int value) {
            this.value = value;
        }
    }
    public TreeInfo getTreeInfo(BinaryTree tree){
        if(tree == null){
            return new TreeInfo(0,0);
        }

        TreeInfo leftTreeInfo = getTreeInfo(tree.left);
        TreeInfo rightTreeInfo = getTreeInfo(tree.right);

        int longestPathThroughRoot = leftTreeInfo.height + rightTreeInfo.height;
        int maxDiameterSoFar = Math.max(leftTreeInfo.diameter, rightTreeInfo.diameter);
        int currentDiameter = Math.max(longestPathThroughRoot,maxDiameterSoFar);
        int currentHeight = 1 + Math.max(leftTreeInfo.height, rightTreeInfo.height);

        return new TreeInfo(currentDiameter, currentHeight);
    }

    static class TreeInfo {
        public int diameter;
        public int height;
        public TreeInfo(int diameter, int height){
            this.diameter = diameter;
            this.height = height;
        }
    }

    public int binaryTreeDiameter(BinaryTree tree) {
        return getTreeInfo(tree).diameter;
    }
}
