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
    private void setHead(Node<T> node){

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

    public boolean search(T targetData){
        IteratorForLinkedList<T> it = new IteratorForLinkedList<T>(this.getHead());
        while(it.hasNext()){
            T data = it.next();
            if(data.equals(targetData))
                return true;
        }
        return false;
    }
    @SuppressWarnings("hiding")
    private class IteratorForLinkedList<T> implements Iterator<T>{

        Node<T> nextNode;
        public IteratorForLinkedList(Node<T> node){
            this.nextNode = node;
        }
        @Override
        public boolean hasNext() {
            // TODO Auto-generated method stub
            return(next()!=null);
        }
        @Override
        public T next() {
            // TODO Auto-generated method stub
            T nextData = this.nextNode().getData();
            this.setNextNode(this.nextNode().getNext());
            return nextData;
        }
        private Node<T> nextNode(){
            return this.nextNode;
        }
        private void setNextNode(Node<T> node){
            this.nextNode = node;
        }
    }



}
