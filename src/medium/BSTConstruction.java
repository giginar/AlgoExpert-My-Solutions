package medium;

public class BSTConstruction {
    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
        }

        public BST insert(int value) {
            if(value<this.value){
                if(left == null){
                    BST newBST = new BST(value);
                    left = newBST;
                }else{
                    left.insert(value);
                }
            }else{
                if(right == null){
                    BST newBST = new BST(value);
                    right = newBST;
                }else{
                    right.insert(value);
                }
            }
            return this;
        }

        public boolean contains(int value) {
            if(value<this.value){
                if(left == null){
                    return false;
                }else{
                    return left.contains(value);
                }
            }else if(value>this.value){
                if(right == null){
                    return false;
                }else{
                    return right.contains(value);
                }
            }else{
                return true;
            }
        }

        public BST remove(int value) {
            remove(value,null);
            return this;
        }

        public void remove(int value, BST parent){
            BST current = this;
            while(current != null){
                if(value < current.value){
                    parent = current;
                    current = current.left;
                }else if(value > current.value){
                    parent = current;
                    current = current.right;
                }else{
                    if(current.left != null && current.right != null){
                        current.value = current.right.getMinValue();
                        //current.value = smallest value of the right subtree
                        current.right.remove(current.value,current);
                    }else if(parent == null){
                        if(current.left != null){
                            current.value = current.left.value;
                            current.right = current.left.right;
                            current.left = current.left.left;
                        }else if(current.right != null){
                            current.value = current.right.value;
                            current.left = current.right.left;
                            current.right = current.right.right;
                        }else{
                            //current = null;
                        }
                    }else if(parent.left == current){
                        parent.left = current.left != null ? current.left : current.right;
                    }else if(parent.right == current){
                        parent.right = current.right != null ? current.left : current.right;
                    }
                    break;
                }
            }
        }
        public int getMinValue(){
            if(left == null){
                return value;
            }else{
                return left.getMinValue();
            }
        }
    }
}
