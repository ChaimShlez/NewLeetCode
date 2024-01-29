public class Main {
    public static void main(String[] args) {
        LinkedList linkedList1=new LinkedList();
        linkedList1.insert(2);
        linkedList1.insert(4);
        linkedList1.insert(3);


        LinkedList linkedList2=new LinkedList();
        linkedList2.insert(2);
        linkedList2.insert(4);
        linkedList2.insert(3);

        LinkedList linkedList=new LinkedList();

        System.out.println( linkedList.sumOfLinkedLists(linkedList1.root,linkedList2.root));
    }
}
