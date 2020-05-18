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
    public boolean add(){ //overload
        return true;
    }
   public boolean add(T parent, T data){ //overload
        Node<T> current = root;
        while()

   }

    private int size(){
        return this.size;
    }
    private void setSize(int size){
        this.size = size;
    }
}
