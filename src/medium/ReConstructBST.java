package medium;

import java.util.List;

public class ReConstructBST {
//    
    static class BST {
        public int value;
        public BST left = null;
        public BST right = null;

        public BST(int value) {
            this.value = value;
        }
    }

    public BST reconstructBst(List<Integer> preOrderTraversalValues) {
        if(preOrderTraversalValues.size() == 0){
            return null;
        }
        int currentValue = preOrderTraversalValues.get(0);
        int rightSubTreeRootIdx = preOrderTraversalValues.size();

        for(int i = 1; i < preOrderTraversalValues.size(); i++){
            int value = preOrderTraversalValues.get(i);
            if(value >= currentValue){
                rightSubTreeRootIdx = i;
                break;
            }
        }

        BST leftSubtree = reconstructBst(preOrderTraversalValues.subList(1, rightSubTreeRootIdx));
        BST rightSubTree = reconstructBst(preOrderTraversalValues.subList(rightSubTreeRootIdx, preOrderTraversalValues.size()));

        BST bst = new BST(currentValue);
        bst.left = leftSubtree;
        bst.right = rightSubTree;

        return bst;
    }
}
