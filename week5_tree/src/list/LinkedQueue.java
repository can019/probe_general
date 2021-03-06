/*
 * This Code is for 2020 Probe_General session
 * Copyright :: _Yousung,Jung
 * Email :: jys01012@gmail.com
 *
 */
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
	public void clear(){
		this.size = 0;
		this.linkedList.clear();
	}

}
