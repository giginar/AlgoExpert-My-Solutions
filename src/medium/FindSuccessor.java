package medium;

import java.util.ArrayList;

public class FindSuccessor {
//    Write a function that takes in a Binary Tree(where nodes have an additional pointer to their parent node)
//    as well as a node contained in that tree and returns the given node's successor.
    static class BinaryTree {
        public int value;
        public BinaryTree left = null;
        public BinaryTree right = null;
        public BinaryTree parent = null;

        public BinaryTree(int value) {
            this.value = value;
        }
    }

    public BinaryTree findSuccessor(BinaryTree tree, BinaryTree node) {
        ArrayList<BinaryTree> inOrderTraversalOrder = new ArrayList<>();
        getInOrderTravelsalOrder(tree, inOrderTraversalOrder);
        for(int i = 0; i < inOrderTraversalOrder.size(); i++){
            BinaryTree currentNode = inOrderTraversalOrder.get(i);
            if(currentNode != node){
                continue;
            }
            if(i == inOrderTraversalOrder.size()-1){
                return null;
            }
            return inOrderTraversalOrder.get(i+1);
        }
        return null;
    }

    public void getInOrderTravelsalOrder(BinaryTree node, ArrayList<BinaryTree> order){
        if(node == null){
            return;
        }
        getInOrderTravelsalOrder(node.left,order);
        order.add(node);
        getInOrderTravelsalOrder(node.right,order);
    }
}
