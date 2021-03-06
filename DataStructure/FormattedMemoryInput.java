import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.concurrent.ConcurrentHashMap;

public class FormattedMemoryInput {
	public static void main(String[] args) throws IOException {
		try {
			DataInputStream in = new DataInputStream(
					new ByteArrayInputStream(BufferedInputFile.read("BubbleSort.java").getBytes()));
			
			while(true) {
				System.out.print((char)(in.readByte()));
			}
		} catch (EOFException e) {
			// TODO: handle exception
			System.out.println("End of stream");
		}
	}
}
