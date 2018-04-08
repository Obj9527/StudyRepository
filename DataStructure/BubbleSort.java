
public class BubbleSort {
	private int a[] = null;
	private int temp;
	
	public BubbleSort(int arrary[]) {
		this.a = arrary;
	}	
	
	public int[] sort() {
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = a.length - 1; j > i; j--) {
				if (a[j] < a[j - 1]) {
					temp = a[j-1];
					a[j-1] = a[j];
					a[j] = temp;
				}
			}
		}
		return a;
	}
	
}
