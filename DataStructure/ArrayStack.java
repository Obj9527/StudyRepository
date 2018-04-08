/**
 * @author Obj9527
 *
 */

public class ArrayStack{
	private int data[] = null;//数据域
	private int top = -1;//指针
	
	public ArrayStack(int maxSize) {
		data = new int[maxSize];
	}
	
	/*
	 * 入栈
	 */
	public void push(int num) {
		if (top == data.length-1) {
			throw new RuntimeException("stack is full");
		}
		
		data[(++top)] = num;
	}
	
	/*
	 * 出栈
	 */
	public int pop() {
		if (isEmpty()) {
			throw new RuntimeException("stack is empty");
		}
		
		return data[(top--)];
	}
	
	/*
	 * 判断栈空
	 */
	public boolean isEmpty() {
		if (top == -1) {
			return true;
		}
		return false;
	}
}
