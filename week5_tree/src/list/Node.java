/*
 * This Code is for 2020 Probe_General session
 * Copyright :: _Yousung,Jung
 * Email :: jys01012@gmail.com
 *
 */
package list;

public class Node<T> {
    private T data;
    private Node<T> next;
    private Node<T> pre;

    public Node(){
        this.data = null;
        this.next = null;
        this.pre = null;
    }
    public Node(T data) {
        this.data = data;
        this.next= null;
        this.pre = null;
    }
    public Node<T> getNext() {
        return this.next;
    }
    public void setNext(Node<T> next) {
        this.next = next;
    }
    public void setData(T data) {
        this.data = data;
    }
    public T getData() {
        return this.data;
    }
    public Node<T> getPre() {
        return this.pre;
    }
    public void setPre(Node<T> pre) {
        this.pre = pre;
    }
}