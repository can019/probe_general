package list;

public class LinkedStack<T> extends LinkedList{
    private LinkedList<T> linkedList;
    private int size;
    public LinkedStack(){
        this.linkedList = new LinkedList<T>();
        this.size=0;
    }
    public boolean push(T data){
        this.size++;
        return linkedList.add(data);
    }
    public T pop(){
        T popped = linkedList.removeLast();
        if(popped==null) {
            return null;
        }
        this.size--;
        return popped;
    }
    public int getSize() {
        return this.size;
    }
}
