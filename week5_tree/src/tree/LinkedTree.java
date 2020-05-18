package tree;

public class LinkedTree<T> {
    private Node<T> root;
    private int size;

    public LinkedTree(){
        root = new Node<T>();
        int size = 0;
    }

    public Node<T> getRoot(){
        return this.root;
    }
    public boolean isEmpty(){
        if(this.size()==0)
            return true;
        return false;
    }
    public boolean addLeft(T data){

        return true;
    }
    public boolean addRight(T data){

    }
    public T removeLeft(){

    }
    public T removeRight(){

    }
    private int size(){
        return this.size;
    }
    private void setSize(int size){
        this.size = size;
    }
}
