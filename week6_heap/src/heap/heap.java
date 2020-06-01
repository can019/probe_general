package heap;
import java.util.Queue;
import java.util.LinkedList;
public class heap {
    private final int DEFAULT_HEAP_SIZE = 10;
    private int[] heap;
    private int size;


    public heap() {
        heap = new int[DEFAULT_HEAP_SIZE];
        this.setSize(0);
    }

    public heap(int size) {
        this.heap = new int[size];
        this.setSize(0);
    }

    public int size() {
        return this.size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int root() {
        return 1;
    }

    private boolean isFull() {
        if (this.size == this.heap.length)
            return true;
        return false;
    }

    private boolean isEmpty() {
        if (this.size == 0)
            return false;
        return true;
    }

    public int bfsReculsively(Queue queue,int data) {
        int current = (int)queue.poll();
        if (heap[current] < data || heap[current] == data) {

        } else if () {

        }
        return 0;

    }

    public boolean add(int data) {
        if (isFull())
            return false;
        if (isEmpty())
            this.heap[this.root()] = data;
        else {
            Queue<Integer> queue = new LinkedList();
            queue.add(this.root());
            int a = bfsReculsively(queue, data);
            System.out.println('s');
        }
        return true;
    }
}
