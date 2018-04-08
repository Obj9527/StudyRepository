import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.StringReader;
import java.util.Scanner;

public class MemoryInput {
	public static void main(String[] args) throws IOException {
		StringReader sReader = new StringReader(BufferedInputFile.read("d:/hello.txt"));
		int c;
		while((c = sReader.read()) != -1) {
			System.out.print((char)c);
		}
	}
}
