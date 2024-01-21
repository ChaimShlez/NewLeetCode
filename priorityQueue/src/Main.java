import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Heap heap=new Heap();

        heap.insert(34);
        heap.insert(24);
        heap.insert(12);
        heap.insert(43);
        heap.insert(11);
        heap.insert(4);
        heap.insert(22);
        heap.insert(111);
        heap.insert(1);
        heap.insert(9);
        //System.out.println(heap);
        heap.poll();
      //  System.out.println(heap);
        heap.hearSort();

        System.out.println(  heap.transform());
        //by default the heap us min heap
//        Queue<Integer> heap=new PriorityQueue<>(Collections.reverseOrder());
//        heap.add(1);
//        heap.add(4);
//        heap.add(2);
//        while (!heap.isEmpty()){
//            System.out.println(heap.poll());
//        }
    }
}
