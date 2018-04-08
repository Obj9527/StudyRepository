import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;

public class BasicFileOutput {
	
	public static void main(String[] args) throws IOException {
		File file = new File("d:/c.txt");
		BufferedReader bReader = new BufferedReader(
				new StringReader(BufferedInputFile.read("d:/hello.txt")));
		
		PrintWriter pWriter = new PrintWriter(
				new BufferedWriter(new FileWriter(file)));
		
		int lineCount = 1;
		String string;
		while((string = bReader.readLine()) != null) {
			pWriter.println(lineCount++ + ": " + string);
		}
		pWriter.close();
		System.out.println(BufferedInputFile.read("d:/c.txt"));
	}
}
