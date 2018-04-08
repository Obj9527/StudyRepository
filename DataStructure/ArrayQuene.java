/**
 * @author Obj9527
 *
 */

public class ArrayQuene {
	int data[] = null;//������
	int front = 0;//ͷָ��
	int rear = 0;//βָ��
	
	/*
	 * ����ʱ������д�С
	 */
	public ArrayQuene(int maxSize) {
		data = new int[maxSize];
	}
	
	/*
	 * ���
	 */
	public void enQuene(int value) {
		if ((rear+1) % this.data.length == front) {
			throw new RuntimeException("The Quene is full");
		}
		
		rear = (rear+1) % this.data.length;
		data[rear] = value;
	}
	
	/*
	 * ����
	 */
	public int deQuene() {
		if (front == rear) {
			throw new RuntimeException("The Quene is empty");
		}
		
		front = (front + 1) % this.data.length;
		return data[front];
	}
}
