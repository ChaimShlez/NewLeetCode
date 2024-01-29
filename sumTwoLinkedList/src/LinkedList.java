public class LinkedList {
    protected   Node root;

    public LinkedList() {
        this.root = null;
    }
    public void insert(int value){
        if (root==null){
            this.root=new Node(value);
        }
        else {
            insertBeginning(value);
        }
    }

    private void insertBeginning(int value) {
        Node newNode=new Node(value);
        newNode.setNext(root);
        root=newNode;
    }

    public LinkedList sumOfLinkedLists(Node node, Node node1){
        LinkedList linkedList=new LinkedList();
        int digit=0;
       int num1=sumLInkedList(node,digit);
        int num2=sumLInkedList(node,digit);
        int result =num1+num2;
        insertLinkedList(linkedList,result);

        return linkedList;
    }

    private void insertLinkedList(LinkedList linkedList, int result) {
        int digit=0;
        while (result>0){

            digit=result%10;

            linkedList.insert(digit);
             result=result/10;

        }
    }


    private int sumLInkedList(Node node,int digit) {
        if (node == null) {
            return digit;
        }
        digit = digit * 10 + node.getValue();
        return sumLInkedList(node.getNext(), digit);
    }

    @Override
    public String toString() {
        return "LinkedList{" +
                "root=" + root +
                '}';
    }
}
