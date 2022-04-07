package medium;

import java.util.ArrayList;
import java.util.List;

public class FindKthLargestValueInBst {
//    Write a function that takes in a Binary Search Tree and a positive integer and returns the kth largest integer contained in the BST.
    static class BST {
        public int value;
        public BST left = null;
        public BST right = null;

        public BST(int value) {
            this.value = value;
        }
    }

    public int findKthLargestValueInBst(BST tree, int k) {
        List<Integer> results = new ArrayList<>();
        inOrderTraverse(tree,results);
        int kthValue = results.get(results.size() - k);
        return kthValue;
    }

    public static List<Integer> inOrderTraverse(BST tree, List<Integer> array) {
        if(tree.left != null){
            inOrderTraverse(tree.left,array);
        }
        array.add(tree.value);
        if(tree.right != null){
            inOrderTraverse(tree.right,array);
        }
        return array;
    }
}
