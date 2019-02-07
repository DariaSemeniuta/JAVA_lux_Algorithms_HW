package project.binaryTreeSearch;

public class Tree {

    public Node root;
    public Node rightChild;
    public Node leftChild;

    public Tree() {
        this.root = null;
        this.leftChild = null;
        this.rightChild = null;
    }

    public  void addNode(Node newNode, Node top){
        if(this.root==null){
            this.root = newNode;
        }
        if(top==null){
            top = newNode;
        }

        else {
            if (newNode.value<top.value) {
                if (!top.hasLeftChild()) {
                    top.leftChild = newNode;
                } else {
                    addNode(newNode, top.leftChild);
               }
            }
            else{
                if(!top.hasRightChild()){
                    top.rightChild = newNode;
                }
                else{
                    addNode(newNode, top.rightChild);
                }
            }
        }
    }

    public void findNode(int value, Node top){
        if (value==top.value){
            System.out.println("\n\nfound node - " + top.value);
            if(top.hasLeftChild()){
                System.out.println("with left child - " + top.leftChild.value);
            }
            if(top.hasRightChild()){
                System.out.println("with right child - " + top.rightChild.value);
            }
        }
        else {
            if((value<top.value)&&(top.hasLeftChild())){
                findNode(value, top.leftChild);
            }
            else if((value>top.value)&&(top.hasRightChild())){
                findNode(value, top.rightChild);
            }
            else {
                System.out.println("There isn't node with mentioned value");
            }
        }

    }

    public void removeNode(int value){

    }

    public void printTree(Node top, String description){
        System.out.println(description + top.value);
        if(top.hasRightChild()) {
            System.out.println(description+"right child - " + top.rightChild.value);
            printTree(top.rightChild, "right node - ");
        }
        if(top.hasLeftChild()) {
            System.out.println(description+"left child - " + top.leftChild.value);
            printTree(top.leftChild, "left node - ");
        }
    }



    public static void main(String[] args){
        int[] arr = {2, 3, 8, 1, 5, 9};
        Tree bts = new Tree();
        for (int i=0; i<arr.length;++i){
            bts.addNode(new Node(arr[i]), bts.root);
        }
        bts.printTree(bts.root, "root - ");
        bts.findNode(8, bts.root);
    }
}
