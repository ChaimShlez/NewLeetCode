public class LinkedList {
    Node root;

    public LinkedList() {
        this.root = null;
    }

    public void insert(int data) {

        if (root == null) {
            root = new Node(data);
        } else {
            insertBeginning(data);
        }

    }

    private void insertBeginning(int data) {
        Node newNode=new Node(data);
        newNode.setNext(root);
        root=newNode;
    }
}
