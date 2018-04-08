import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

public class TextFile{
	public static String read(String fileName) {
		StringBuilder sBuilder = new StringBuilder();
		try {
			BufferedReader in = new BufferedReader(new FileReader(new File(fileName).getAbsolutePath()));
			try {
				String string;
				while ((string = in.readLine()) != null) {
					sBuilder.append(string);
					sBuilder.append("\n");
				}
			} finally {
				in.close();
			}
		} catch (IOException e) {
			throw new RuntimeException();
		}
		return sBuilder.toString();
	}
	
	public static void write(String fileName, String text) {
		try {
			PrintWriter out = new PrintWriter(new File(fileName).getAbsolutePath());
			try {
				out.print(text);
			}finally {
				out.close();
			}
		} catch (Exception e) {
			throw new RuntimeException();
		}
	}
}
