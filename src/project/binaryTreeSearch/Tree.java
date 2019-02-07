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
                /*if (!top.hasLeftChild()) {
                    top.leftChild = newNode;
                } else {*/
                    addNode(newNode, top.leftChild);
//                }
            }
            else{
                /*if(!top.hasRightChild()){
                    top.rightChild = newNode;
                }
                else{*/
                    addNode(newNode, top.rightChild);
//                }

                }
            }

    }

    public void printTree(Node top){

        //while(top!=null) {
            System.out.println("root - " + top.value);
            //while (top.hasChilds()) {
                System.out.println("left - " + top.rightChild.value);
                printTree(top.rightChild);
                System.out.println("right - " + top.leftChild.value);
                printTree(top.leftChild);
            //}
            //printTree(top.getLeftChild());
            //printTree(top.getRightChild());
        //}
    }

    public static void main(String[] args){
        int[] arr = {2, 3, 1};
        Tree bts = new Tree();
        for (int i=0; i<arr.length;++i){
            bts.addNode(new Node(arr[i]), bts.root);
        }
        bts.printTree(bts.root);
    }
}
