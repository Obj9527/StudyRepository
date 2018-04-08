/**
 * @author Obj9527
 *
 */

public class ArrayQuene {
	int data[] = null;//数据域
	int front = 0;//头指针
	int rear = 0;//尾指针
	
	/*
	 * 创建时赋予队列大小
	 */
	public ArrayQuene(int maxSize) {
		data = new int[maxSize];
	}
	
	/*
	 * 入队
	 */
	public void enQuene(int value) {
		if ((rear+1) % this.data.length == front) {
			throw new RuntimeException("The Quene is full");
		}
		
		rear = (rear+1) % this.data.length;
		data[rear] = value;
	}
	
	/*
	 * 出队
	 */
	public int deQuene() {
		if (front == rear) {
			throw new RuntimeException("The Quene is empty");
		}
		
		front = (front + 1) % this.data.length;
		return data[front];
	}
}
