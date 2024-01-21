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


    public Node mergeTwoLinkedLists(Node node1, Node node2) {
        if (node1 == null) {
            return node2;
        }
        if (node2 == null) {
            return node1;
        }

        Node result;
        if (node1.getValue() > node2.getValue()) {
            result = node1;
            result.setNext(mergeTwoLinkedLists(node1.getNext(), node2));


        } else {
            result = node2;
            result.setNext(mergeTwoLinkedLists(node1, node2.getNext()));
        }

        return result;
    }

    @Override
    public String toString() {
        return "LinkedList{" +
                "root=" + root +
                '}';
    }
}
