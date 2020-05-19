/*
 * This Code is for 2020 Probe_General session
 * Copyright :: _Yousung,Jung
 * Email :: jys01012@gmail.com
 *
 */
package tree;

public class Node<T> {
    private T data;
    private Node<T> left;
    private Node<T> right;
    private Node<T> parent;
    public Node(){
        this.left = null;
        this.right = null;
        this.data = null;
        this.parent = null;
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
    public Node<T> getParent(){return this.parent;}
    public void setParent(Node<T> parent){this.parent = parent;}


}