public class LinkedList {

    Node root;
    private int size;

    public LinkedList() {
        this.root = null;
    }

    public void insert(int data) {

        if (root == null) {
            root = new Node(data);
            size++;
        } else {
            Node newNode=new Node(data);
            newNode.setNext(root);
            root=newNode;
            size++;
        }

    }

//    private void insertBeginning(int data) {
//        Node newNode=new Node(data);
//        newNode.setNext(root);
//        root=newNode;
//    }
    public void displaySize(){
        System.out.println("Size :" + size);
    }

    public void display() {
        //Node current will point to head
        Node current = root;

        if(root == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("Nodes of singly linked list: ");
        while(current != null) {
            //Prints each node by incrementing pointer
            System.out.print(current.getValue() + " ");
            current = current.getNext();
        }
        System.out.println();
    }

    public void removeDuplicate(Node root){
        while (size>1){
            if (root.getValue()==root.getNext().getValue()){
                root.setNext(root.getNext().getNext());
               size=size-2;
                removeDuplicate(root.getNext());

            }
            else {
                size--;
                removeDuplicate(root.getNext());

            }
        }

    }


    @Override
    public String toString() {
        return "LinkedList{" +
                "root=" + root +
                '}';
    }
}
