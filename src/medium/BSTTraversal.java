package medium;

import java.util.List;

public class BSTTraversal {
//    Write 3 functions that take in a BST and an empty array, traverse the BST,
//    add its nodes' values to the input array and return that array.
//    The three functions should traverse BST using the in-order,pre-order and post-order three-traversal techniques, respectively.
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

    public static List<Integer> preOrderTraverse(BST tree, List<Integer> array) {
        array.add(tree.value);
        if(tree.left != null){
            preOrderTraverse(tree.left,array);
        }
        if(tree.right != null){
            preOrderTraverse(tree.right,array);
        }
        return array;
    }

    public static List<Integer> postOrderTraverse(BST tree, List<Integer> array) {
        if(tree.left != null){
            postOrderTraverse(tree.left,array);
        }
        if(tree.right != null){
            postOrderTraverse(tree.right,array);
        }
        array.add(tree.value);
        return array;
    }

    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
        }
    }
}
