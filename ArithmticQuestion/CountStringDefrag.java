package ThreadPart;

import java.util.Scanner;

public class CountStringDefrag {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String inputNum = null;
		while(in.hasNextLine()) {
			inputNum = in.nextLine();
			break;
		}
		
		String end[] = splitString(inputNum);
		System.out.printf("%.2f",count(end));
	}
	
	public static String[] splitString(String in) {
		String end[] = new String[in.length()];
		int start = 0;
		
		for(int i = 1,j = 0; i < in.length(); i++) {
			if (in.charAt(i - 1) != in.charAt(i)) {
				end[j++] = in.substring(start, i);
				start = i;
			}
			
			if (i == in.length() - 1) {
				end[j] = in.substring(start,i + 1); 
			}
		}
		
		return end;
	}
	
	public static double count(String in[]) {
		double sum = 0;
		int count = 0;
		
		for (String string : in) {
			if (string != null) {
				sum += string.length();
				count++;
			}
		}
		
		if (count == 0) {
			throw new RuntimeException("count²»ÄÜÎª0");
		}
		
		return sum/count;
	}
}
