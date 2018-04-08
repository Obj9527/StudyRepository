import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class BufferedInputFile{
	public static String read(String filename) throws IOException {
		StringBuffer sBuffer = new StringBuffer();
		
		try {
//			System.out.println("Please enter file path:");
//			Scanner scanner = new Scanner(System.in);
//			String filename = scanner.nextLine();
//			scanner.close();
			
			File file = new File(filename);
			BufferedReader in = new BufferedReader(new FileReader(file));
			String s;			

			while ((s = in.readLine()) != null) {
				sBuffer.append(s + "\n");
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return sBuffer.toString();
	}
	
	private static String normalize(String word) {
		String c = word.charAt(0) + "";
		char[] charArray = word.toCharArray();
		String end = c.toUpperCase();
		for(int i = 1;i < word.length();i++) {
			end += charArray[i];
		}
		return end;
	}
}