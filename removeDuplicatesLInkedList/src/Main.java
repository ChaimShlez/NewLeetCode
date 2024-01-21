public class Main {
    public static void main(String[] args) {


        LinkedList linkedList2 = new LinkedList();
        linkedList2.insert(1);
        linkedList2.insert(2);
        linkedList2.insert(3);
        linkedList2.insert(3);
        System.out.println(linkedList2);
        linkedList2.insert(43);
        System.out.println(linkedList2);
        linkedList2.displaySize();
        linkedList2.removeDuplicate(linkedList2.root);
        System.out.println(linkedList2);
        linkedList2.displaySize();

    }
}
