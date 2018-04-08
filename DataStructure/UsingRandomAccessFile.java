import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class UsingRandomAccessFile {
	static String file = "d:/hello.txt";
	
	static void display() throws IOException {
		RandomAccessFile rFile = new RandomAccessFile(file, "r");
		
		for (int i = 0; i < 7; i++) {
			System.out.println("Value" + i + ":" + rFile.readDouble());			
		}
		System.out.println(rFile.readUTF());
		rFile.close();
	}
	
	public static void main(String[] args) throws IOException {
		RandomAccessFile rFile = new RandomAccessFile(file, "rw");
		for (int i = 0; i < 7; i++) {
			rFile.writeDouble(i*1.414);			
		}
		rFile.writeUTF("The end of the file");
		rFile.close();
		display();
	}
}
