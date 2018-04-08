package IOPart;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
	private static final byte[] buffer = new byte[1024];

	public static void copy(String path) throws IOException {
		File sourseFile = new File(path);
		BufferedInputStream in = new BufferedInputStream(new FileInputStream(sourseFile));
		BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("haha.mp3"));
		int len;
		while((len = in.read(buffer)) != -1) {
			out.write(buffer,0,len);
		}
		out.close();
		in.close();
	}
	
	public static void main(String[] args) throws IOException {
		CopyFile.copy("D:\\CloudMusic\\23minutes into the dream - Friend or foe.mp3");
	}
}
