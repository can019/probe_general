package heap;

public class heap {
    private final int DEFAULT_HEAP_SIZE = 10;
    private int [] heap;
    private int size;

    public heap(){
        heap = new int[DEFAULT_HEAP_SIZE];
        this.setSize(0);
    }
    public heap(int size){
        this.heap = new int[size];
        this.setSize(0);
    }

    public int size(){
        return this.size;
    }
    public void setSize(int size){
        this.size = size;
    }



}
