package IOPart;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Properties;

import javax.print.attribute.standard.MediaName;

public class mergeFile {
	private static final int size = 1024*1024;

	public static void merge(String dirPath) throws IOException {
		//取得property文件=======================================================
		File dir = new File(dirPath);
		File files[] = dir.listFiles(new SuffixFilter(".property"));
		File propFile = files[0];
		if (!propFile.exists()) {
			throw new RuntimeException("Need Property File!");
		}
		
		//取得文件名和文件数==========================================================
		FileReader fileReader = new FileReader(propFile);
		Properties properties = new Properties();
		properties.load(fileReader);
		String fileName = properties.getProperty("fileName");
		int count = Integer.parseInt(properties.getProperty("time"));
		
		//合并部分=================================================================
		files = dir.listFiles(new SuffixFilter(".part"));
		ArrayList<InputStream> aList = new ArrayList<InputStream>();
		for (int i = 0; i < count - 1; i++) {
			aList.add(new FileInputStream(files[i]));
		}
		
		Enumeration<InputStream> e = Collections.enumeration(aList);
		SequenceInputStream in = new SequenceInputStream(e);
		BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(new File(dirPath,fileName)));
		int len;
		byte buffer[] = new byte[size];
		while((len = in.read(buffer)) != -1) {
			out.write(buffer,0,len);
		}		
		
		out.close();
		in.close();
	}
	
	public static void main(String[] args) throws IOException {
		merge("E:\\eclipse-workspace\\j2ee\\haha");
	}
}
