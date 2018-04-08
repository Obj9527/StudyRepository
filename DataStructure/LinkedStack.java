/**
 * @author Obj9527
 *
 */

public class LinkedStack{
	LNode<Object> head = null;//ͷ�ڵ�
	
	/*
	 * �ڲ����������嵥����ڵ�
	 */
	private class LNode<T>{
		T data;
		public LNode<T> next;
		
		public LNode(T data) {
			this.data = data;
		}
		
		@Override
		public String toString() {
			return data.toString();
		}
	}
		
	public LinkedStack(Object data) {		
		head = new LNode<Object>(data);
	}
	
	/*
	 * ��ͷ�巨��ջʵ��LIFO����ջ���õ��Ƿ������ڴ�����
	 * ����Ҫ����ջ�������������ڴ汬��
	 */
	public void push(Object data) {
		LNode<Object> node = new LNode<Object>(data);
		node.next = head.next;
		head.next = node;
	}

	/*
	 * Java�����ֶ�ָ�����ٶ����������ﲻ�ù�freeNode��
	 * ��Java�����������Լ�������ջ��Ҫ����ջ�գ�������Ҫ
	 * ���п�ջ�ж�
	 */
	public Object pop() {
		if (head.next == null) {
			throw new RuntimeException("The Stack is empty");
		}
		
		LNode<Object> freeNode = head.next;
		head.next = freeNode.next;
		return freeNode.data;
	}
}
