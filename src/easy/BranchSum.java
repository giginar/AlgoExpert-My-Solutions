package easy;

import java.util.ArrayList;
import java.util.List;

public class BranchSum {

    //Write a function that takes in a binary tree
    //and returns a list of its branch sums ordered from leftmost branch sum to rightmost branch sum.
    public static class BinaryTree {
        int value;
        BinaryTree left;
        BinaryTree right;

        BinaryTree(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    public static List<Integer> branchSums(BinaryTree root) {
        List<Integer> sums = new ArrayList<>();
        calculateBranchSums(root, 0, sums);
        return sums;
    }

    public static void calculateBranchSums(BinaryTree tree, int sum, List<Integer> sums){
        if (tree == null) {
            return;
        }

        int newSum = tree.value + sum;

        if (tree.left == null && tree.right == null) {
            sums.add(newSum);
            return;
        }

        calculateBranchSums(tree.left, newSum, sums);
        calculateBranchSums(tree.right, newSum, sums);
    }
}
