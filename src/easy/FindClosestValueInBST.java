package easy;

public class FindClosestValueInBST {

    //Write a function that takes in a Binary Search Tree(BST) and a target integer value
    //and returns the closest value to that target value contained in the BST.
    public static int findClosestValueInBst(BST tree, int target) {
        return findClosestValueHelper(tree,target,tree.value);
    }

    public static int findClosestValueHelper(BST tree, int target, int closest){
        if(tree == null){
            return closest;
        }
        if (Math.abs(target-closest)>Math.abs(target-tree.value)){
            closest = tree.value;
        }
        if(target<tree.value){
            return findClosestValueHelper(tree.left,target,closest);
        }else if(target>tree.value){
            return findClosestValueHelper(tree.right,target,closest);
        }else{
            return closest;
        }
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
