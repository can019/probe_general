package tree;
import list.LinkedQueue;
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
    public boolean add(T data){ //overload
        LinkedQueue<Node> queue = new LinkedQueue<Node>();
        Node<T> current = root;
        queue.push(root);
        Node<T> temp = MakeNodeByBFS(queue);
        if(temp==null)
            return false;
        temp.setData(data);
        this.setSize(this.size()+1);
        return true;
    }
    public boolean add(T parent, T data){ //overload
        LinkedQueue<Node> queue = new LinkedQueue<Node>();
        queue.push(root);
        Node<T> current = MakeNodeByBFS(queue,parent);
        if(current==null)
            return false;
        current.setData(data);
        return true;
    }
    public Node<T> MakeNodeByBFS(LinkedQueue<Node> queue){//overload
        Node<T> current = queue.pop();
        Node<T> left = current.getLeft();
        Node<T> right = current.getRight();
        if(left!=null&&right!=null){
            queue.push(left);
            queue.push(right);
            return MakeNodeByBFS(queue);
        }
        else{
            if(left==null){
                Node<T> temp = new Node<T>();
                current.setLeft(temp);
                temp.setParent(current);
                return temp;
            }
            else {
                Node<T> temp = new Node<T>();
                current.setRight(temp);
                temp.setParent(current);
                return temp;
            }
        }
    }
    public Node<T> MakeNodeByBFS(LinkedQueue<Node> queue,T parent){//overload
        Node<T> current = queue.pop();
        Node<T> left = current.getLeft();
        Node<T> right = current.getRight();
        if(current.getData()==parent){
            if(left==null){
                Node<T> temp = new Node<T>();
                current.setLeft(temp);
                temp.setParent(current);
                return temp;
            }
            else if(right==null){
                Node<T> temp = new Node<T>();
                current.setRight(temp);
                temp.setParent(current);
                return temp;
            }
            return null;
        }
        else{
            queue.push(left);
            queue.push(right);
           return  MakeNodeByBFS(queue,parent);
        }

    }
    private int size(){
        return this.size;
    }
    private void setSize(int size){
        this.size = size;
    }
}
