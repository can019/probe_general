package list;

public class LinkedQueue<T> extends LinkedList {
	/*
	 * �ڹ� Collection FrmaeWork������ Queue�� interface�� ���.
	 * LinkedList�� Queue�� ��� �޴� ���·� ����
	 * ��> Dequeue, priorityQueue�Ͱ��� ������ �ڷᱸ���� ����, �̸� �����ֱ� ����
	 * 
	 * ������ �̹� �ð��� Queue�� �����ϴ� ���� �����̹Ƿ� LinkedList�� ���.
	 */
	private LinkedList<T> linkedList;
	private int size;
	public LinkedQueue(){
		this.linkedList = new LinkedList<T>();
		this.size=0;
	}
	public boolean push(T data) {
		//����
		return false;
	}
	public T pop() {
		//����
		return null;
	}
	public int getSize() {
		return this.size;
	}

}
