public class Main {
    public static void main(String[] args) {
       LinkedList linkedList1= new LinkedList();
       linkedList1.insert(1);
        linkedList1.insert(2);
        linkedList1.insert(4);
        linkedList1.insert(66);

       // System.out.println(linkedList1);
        LinkedList linkedList2=new LinkedList();
        linkedList2.insert(1);
        linkedList2.insert(2);
        linkedList2.insert(3);
        linkedList2.insert(4);
        linkedList2.insert(43);
       // System.out.println(linkedList2);
        LinkedList resultLinkedList = new LinkedList();
        System.out.println(resultLinkedList.mergeTwoLinkedLists(linkedList1.root, linkedList2.root));


    }
}
