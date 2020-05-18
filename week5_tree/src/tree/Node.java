package tree;

public class Node<T> {
    private T data;
    private Node<T> left;
    private Node<T> right;

    public Node(){
        this.left = null;
        this.right = null;
        this.data = null;
    }

    public T getData(){
        return this.data;
    }
    public void setData(T data){
        this.data = data;
    }
    public Node<T> getLeft(){
        return this.left;
    }
    public void setLeft(Node<T> left){
        this.left = left;
    }
    public Node<T> getRight(){
        return this.right;
    }
    public void setRight(Node<T> right){
        this.right = right;
    }


}