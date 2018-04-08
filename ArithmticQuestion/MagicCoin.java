package ThreadPart;

import java.util.ArrayList;
import java.util.Scanner;

public class MagicCoin {
	public static void main(String[] args) {
		StringBuilder process = new StringBuilder();
		ArrayList<String> list = new ArrayList<String>();
		Scanner in = new Scanner(System.in);
		int wantedMagicCoinNum = 0;
		while(in.hasNextInt()) {
			wantedMagicCoinNum = in.nextInt();
			break;
		}
		int magicCoinNum = 0;
		int count = 0;
		
		while (true) {
			process.setLength(0);
			magicCoinNum = 0;
			
			for (int i = 0; i < count; i++) {
				magicCoinNum = machine1(magicCoinNum, process);
				
				if (magicCoinNum == wantedMagicCoinNum) {
					list.add(process.toString());
					break;
				}
			}
			
			if (magicCoinNum > wantedMagicCoinNum) {
				break;
			}

			while (magicCoinNum < wantedMagicCoinNum) {
				magicCoinNum = machine2(magicCoinNum, process);

				if (magicCoinNum == wantedMagicCoinNum) {
					list.add(process.toString());
					break;
				}
			}
			
			count++;	
		}
		if (!list.isEmpty()) {
			for (String string : list) {
				System.out.println(string);
			}
		}
		else {
			System.out.println("no answer");
		}
	}

	public static int machine1(int magicCoinNum, StringBuilder process) {
		process.append("1");
		return 2*magicCoinNum + 1;
	}
	
	public static int machine2(int magicCoinNum, StringBuilder process) {
		process.append("2");
		return 2*magicCoinNum + 2;
	}
}
