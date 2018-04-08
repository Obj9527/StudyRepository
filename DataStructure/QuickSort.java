
public class QuickSort {
	public static void sort(int a[], int l, int r) {
		if (l >= r) {
			return;
		}
		
		int i = l;
		int j = r;
		int key = a[i];
					
		while (i < j) {
			while (i < j && a[j] >= key) j--;
			
			if (i < j) {
				a[i] = a[j];
				i++;
			}
			
			while (i < j && a[i] <= key) i++;
			
			if (i < j) {
				a[j] = a[i];
				j--;
			}					
		}
		
		a[i] = key;
		sort(a, l, i - 1);
		sort(a, i + 1, r);			
	}
}
