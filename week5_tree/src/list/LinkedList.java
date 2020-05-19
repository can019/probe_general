/*
 * This Code is for 2020 Probe_General session
 * Copyright :: _Yousung,Jung
 * Email :: jys01012@gmail.com
 *
 */
package list;

public class LinkedList<T>  {
    private Node<T> dummy_head;
    private Node<T> dummy_tail;

    private int size;
    private Node<T> getHead(){
        return this.dummy_head;
    }
    public LinkedList() {
        this.dummy_head = new Node<T>();
        this.dummy_tail = new Node<T>();
        this.dummy_head.setNext(dummy_tail);
        this.dummy_tail.setPre(dummy_head);
        this.size = 0;
    }
    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        if (this.size() == 0)
            return true;
        return false;
    }
    public void setHead(Node<T> node){
        this.dummy_head = node;
    }
    public void clear(){
        this.size=0;
        this.dummy_head.setNext(dummy_tail);
        this.dummy_tail.setPre(dummy_head);
    }
    public boolean add(T data) {
        Node<T> current = new Node<T>(data);
        current.setNext(dummy_tail);
        current.setPre(dummy_tail.getPre());
        dummy_tail.getPre().setNext(current);
        dummy_tail.setPre(current);
        this.size++;
        return true;
    }

    public T removeLast() {
        T data = this.getHead().getData();
        if (this.size() == 1) {
            this.getHead().setData(null);
        } else {
            this.setHead(this.getHead().getPre());
        }
        size--;
        return data;
    }

    public T removeFirst(){
        if(!this.isEmpty()){
            T data = dummy_head.getNext().getData();
            dummy_head.setNext(dummy_head.getNext().getNext());
            dummy_head.getNext().setPre(dummy_head);
            this.size--;
            return data;
        }
        return null;
    }

    public T remove(int index) {
        if(index>this.size)
            return null;
        Node<T> temp = new Node<T>();
        temp = dummy_head;
        for(int i=0;i<index;i++) {
            temp = temp.getNext();
        }
        T data = temp.getData();
        temp.getPre().setNext(temp.getNext());
        temp.getNext().setPre(temp.getPre());
        return data;
    }





}
