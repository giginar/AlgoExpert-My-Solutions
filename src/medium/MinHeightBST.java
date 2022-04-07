package medium;

import java.util.List;

public class MinHeightBST {
//    Write a function that takes in non-empty sorted array of distinct integers, constructs a BST from the integers, and returns the root of the BST.
    public static BST minHeightBst(List<Integer> array) {
        return constructMinHeightBst(array, null, 0, array.size() - 1);
    }
    public static BST constructMinHeightBst(List<Integer> array, BST bst, int start, int end){
        if(end<start){
            return null;
        }
        int mid = (start + end)/2;
        int valueToAdd = array.get(mid);
        if(bst == null){
            bst = new BST(valueToAdd);
        }else{
            bst.insert(valueToAdd);
        }
        constructMinHeightBst(array, bst, start, mid - 1);
        constructMinHeightBst(array, bst, mid + 1, end);
        return bst;
    }

    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
            left = null;
            right = null;
        }

        public void insert(int value) {
            if (value < this.value) {
                if (left == null) {
                    left = new BST(value);
                } else {
                    left.insert(value);
                }
            } else {
                if (right == null) {
                    right = new BST(value);
                } else {
                    right.insert(value);
                }
            }
        }
    }
}
