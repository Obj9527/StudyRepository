/**
 * @author Obj9527
 *
 */

public class ArrayStack{
	private int data[] = null;//������
	private int top = -1;//ָ��
	
	public ArrayStack(int maxSize) {
		data = new int[maxSize];
	}
	
	/*
	 * ��ջ
	 */
	public void push(int num) {
		if (top == data.length-1) {
			throw new RuntimeException("stack is full");
		}
		
		data[(++top)] = num;
	}
	
	/*
	 * ��ջ
	 */
	public int pop() {
		if (isEmpty()) {
			throw new RuntimeException("stack is empty");
		}
		
		return data[(top--)];
	}
	
	/*
	 * �ж�ջ��
	 */
	public boolean isEmpty() {
		if (top == -1) {
			return true;
		}
		return false;
	}
}
