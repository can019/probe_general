package list;

public class LinkedQueue<T> extends LinkedList {
	/*
	 * 자바 Collection FrmaeWork에서는 Queue는 interface로 기술.
	 * LinkedList는 Queue를 상속 받는 형태로 구현
	 * ㄴ> Dequeue, priorityQueue와같은 형태의 자료구조가 존재, 이를 묶어주기 위해
	 * 
	 * 하지만 이번 시간은 Queue를 구현하는 것이 목적이므로 LinkedList를 상속.
	 */
	private LinkedList<T> linkedList;
	private int size;
	public LinkedQueue(){
		this.linkedList = new LinkedList<T>();
		this.size=0;
	}
	public boolean push(T data) {
		//구현
		return false;
	}
	public T pop() {
		//구현
		return null;
	}
	public int getSize() {
		return this.size;
	}

}
