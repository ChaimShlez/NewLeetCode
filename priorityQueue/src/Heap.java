import java.util.Arrays;

public class Heap {
    private int[] heap;
    private int heapSize;

    public Heap() {
        this.heap = new int[10];
    }


    private boolean isFull(){
        return heapSize == heap.length;

    }


    public void insert(int data){
            if (isFull()){
                throw new RuntimeException("Heap is fulling");
            }
            else {
                heap[heapSize]=data;
                heapSize++;
                fixUp(heapSize-1);
            }
    }
    public void hearSort(){
        int n=heapSize;
        for (int i = 0; i < n; i++) {
            int max=poll();
            System.out.println(max);
        }
    }

    private void fixUp(int index) {
        int parentIndex=(index-1)/2;
        if (index > 0 && heap[index]>heap[parentIndex]){
            swap(index,parentIndex);
            fixUp(parentIndex);
        }
    }
    public int getMax(){
        return heap[0];
    }
    public int poll(){
        int max=getMax();
        swap(0,heapSize-1);
        heapSize--;
        fixDown(0);
        return max;
    }
    public int[] transform() {
        for(int i=(heap.length/2);i>=0;i--)
            heapify(i);

        return heap;
    }

    private void heapify(int index) {
        int leftChildIndex=2*index+1;
        int rightChildIndex=2*index+2;
        int parentIndex=index;
        if (leftChildIndex<heapSize&&heap[leftChildIndex]<heap[index]){
            parentIndex=leftChildIndex;
        }
        if (rightChildIndex<heapSize&&heap[rightChildIndex]<heap[parentIndex]){
            parentIndex=rightChildIndex;
        }
        if (index!=parentIndex){
            swap(index,parentIndex);
           heapify(parentIndex);
        }
    }

    private void fixDown(int index) {
        int leftChildIndex=2*index+1;
        int rightChildIndex=2*index+2;
        int parentIndex=index;
        if (leftChildIndex<heapSize&&heap[leftChildIndex]>heap[index]){
            parentIndex=leftChildIndex;
        }
        if (rightChildIndex<heapSize&&heap[rightChildIndex]>heap[parentIndex]){
            parentIndex=rightChildIndex;
        }
        if (index!=parentIndex){
            swap(index,parentIndex);
            fixDown(parentIndex);
        }
    }

    private void swap(int index, int parentIndex) {

        int temp=heap[parentIndex];
        heap[parentIndex]=heap[index];
        heap[index]=temp;
    }

    @Override
    public String toString() {
        return "Heap{" +
                "heap=" + Arrays.toString(heap) +
                ", heapSize=" + heapSize +
                '}';
    }
}
