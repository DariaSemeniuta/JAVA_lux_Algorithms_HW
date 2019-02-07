package project.binaryTreeSearch;

public class Node {
    public Node rightChild;
    public Node leftChild;
    public int value;
    public Node(int val){
        this.value = val;
        this.rightChild = null;
        this.leftChild = null;
    }

    public boolean hasRightChild(){
        boolean flag = false;
        if(this.rightChild!=null){
            flag = true;
        }
        return flag;
    }

    public boolean hasLeftChild(){
        boolean flag = false;
        if(this.leftChild!=null){
            flag = true;
        }
        return flag;
    }
}
