import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class StroringAndRecoveringData {
	public static void main(String[] args) throws IOException {
		File file = new File("d:/c.txt");
		DataOutputStream dStream = new DataOutputStream(
				new BufferedOutputStream(new FileOutputStream(file)));
		
		dStream.writeDouble(3.1415926);
		dStream.writeUTF("That was pi");
		dStream.writeDouble(1.414);
		dStream.writeUTF("Square root of 2");
		dStream.close();
		
		DataInputStream in = new DataInputStream(
				new BufferedInputStream(new FileInputStream("d:/c.txt")));
		
		System.out.println(in.readDouble());
		System.out.println(in.readUTF());
		System.out.println(in.readDouble());
		System.out.println(in.readUTF());
	}
}
