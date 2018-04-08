package IOPart;

import java.io.File;
import java.io.FileFilter;

public class TestFile {
	public static void main(String[] args) {
		/*int count = 0;
		File file = new File("c:/Windows");
		File names[] = file.listFiles(new fileFilter());
		File max = names[0];
		File min = names[0];
		for (File file2 : names) {
			count++;
			if (file2.length() > max.length()) {
				max = file2;
			}
			if (file2.length() < min.length()) {
				min = file2;
			}
		}
		System.out.println("Files number:" + count);
		System.out.println("The maximum File:" + max.getAbsolutePath());
		System.out.println("The minimum File:" + min.getAbsolutePath());*/
		
		
		File file = new File("E:\\eclipse-workspace\\j2ee\\haha");
		System.out.println("exists:" + file.exists());
		System.out.println("absPath:" + file.getAbsolutePath());
	}
}
