package list;

public class LinkedStack<T> extends LinkedList{
    private LinkedList<T> linkedList;
    public LinkedStack(){
       LinkedList<T> linkedList = new LinkedList();
    }
    public boolean push(T data){
        return linkedList.add(data);
    }
    public T pop(){
        return linkedList.removeLast();
    }
}
