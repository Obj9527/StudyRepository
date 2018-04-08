package ThreadPart;

import java.util.Scanner;

public class OppositeNumber {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int inputNum = 0;
		while(in.hasNextInt()) {
			inputNum = in.nextInt();
			break;
		}
		
		System.out.println(inverse(inputNum) + 1325);
	}
	
	public static int inverse(int num) {
		String in = num + "";
		char temp[] = in.toCharArray();
		char c;
		
		for (int i = 0,j = temp.length - 1; i < j; i++,j--) {
			c = temp[i];
			temp[i] = temp[j];
			temp[j] = c;
		}
		
		in = new String(temp);
		return Integer.parseInt(in);
	}
}
