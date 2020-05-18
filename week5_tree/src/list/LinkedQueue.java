package list;

public class LinkedQueue<T> extends LinkedList {
	private LinkedList<T> linkedList;
	private int size;
	public LinkedQueue(){
		this.linkedList = new LinkedList<T>();
		this.size=0;
	}
	public boolean push(T data) {
		linkedList.add(data);
		this.size++;
		return true;
	}
	public T pop() {
		T data = linkedList.removeFirst();
		this.size--;
		return data;
	}
	public int getSize() {
		return this.size;
	}

}
