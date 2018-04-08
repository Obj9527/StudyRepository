
public class ArrayList {
	private int a[] = null;
	private int index = -1;
	
	public ArrayList(int maxSize) {
		a = new int[maxSize];
	}
	
	public int search(int value) {
		for (int i = 0; i < this.a.length; i++) {
			if (value == a[i]) {
				return i;
			}
		}		
		return -1;
	}
	
	public void add(int value) {
		a[++index] = value;
	}
	
	public int remove() {
		return a[index--];
	}
	
	public void insert(int data,int location) {
		if (location < 0 || location > a.length) {
			throw new RuntimeException("location is ");  
		}
		
		if (location > index) {
			add(data);
		}
		else {
			for (int i = index; i >= location; i--) {
				a[i+1] = a[i];
			}		
			a[location] = data;
		}
	}	
}
