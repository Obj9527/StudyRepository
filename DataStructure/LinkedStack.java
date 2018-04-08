/**
 * @author Obj9527
 *
 */

public class LinkedStack{
	LNode<Object> head = null;//头节点
	
	/*
	 * 内部类用来定义单链表节点
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
	 * 用头插法入栈实现LIFO，链栈采用的是非连续内存区域，
	 * 不需要考虑栈满，除非物理内存爆了
	 */
	public void push(Object data) {
		LNode<Object> node = new LNode<Object>(data);
		node.next = head.next;
		head.next = node;
	}

	/*
	 * Java不能手动指定销毁对象，所以这里不用管freeNode，
	 * 让Java垃圾回收器自己处理，出栈需要考虑栈空，所以需要
	 * 进行空栈判断
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
