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
        if (!this.isEmpty()) {
            T data = dummy_tail.getPre().getData();
            dummy_tail.getPre().getPre().setNext(dummy_tail);
            dummy_tail.setPre(dummy_tail.getPre().getPre());
            this.size--;
            return data;
        }
        return null;
    }
    public T removeFirst(){
        if(!this.isEmpty()){

        }
        return null;
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
