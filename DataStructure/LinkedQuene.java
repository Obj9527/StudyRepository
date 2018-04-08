/**
 * @author Obj9527
 *
 */

public class LinkedQuene {
	private QNode<Object> front = new QNode<Object>("head");//ͷָ��
	private QNode<Object> rear = front;//βָ��
	
	/*
	 * �ӽڵ�
	 */
	class QNode<T>{
		T data;
		QNode<T> next;
		
		public QNode(T value) {
			this.data = value;
		}
		
		@Override
		public String toString() {
			return this.data.toString();
		}
	}
	
	/*
	 * ���
	 */
	public void enQuene(Object value) {
		QNode<Object> qNode = new QNode<Object>(value);
		rear.next = qNode;
		rear = qNode;
	}
	
	/*
	 * ����
	 */
	public Object deQuene() {
		if (front == rear) {
			throw new RuntimeException("The Quene is empty!");
		}
		
		front = front.next;
		return front.data;
	}
}
