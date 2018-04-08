package IOPart;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

public class SearchJavaFile {
	public static void searchJava(File dir) throws UnsupportedEncodingException, IOException {
		String names[] = dir.list(new SuffixFilter(".java"));
		
		for (String string : names) {
			System.out.println(string);
		}
	}
	
	public static void search(String dirPath) throws UnsupportedEncodingException, IOException {
		File dir = new File(dirPath);
		searchJava(dir);
		File files[] = dir.listFiles();
		
		for (File file : files) {
			if (file.isDirectory()) {
				search(file.getAbsolutePath());
			}
		}
	}
	
	public static void main(String[] args) throws UnsupportedEncodingException, IOException {
		search("E:\\eclipse-workspace\\j2ee");
	}
}
