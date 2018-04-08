package IOPart;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class spliteFile {
	private static final int size = 1024*1024;

	public static void splite(String filePath,String outdir) throws IOException {
		//检测输出文件夹，如果不存在则创建
		File dir = new File(outdir);
		if (!dir.exists()) {
			dir.mkdirs();
		}
		
		File file = new File(filePath);
		BufferedInputStream in = new BufferedInputStream(new FileInputStream(file));
		FileOutputStream out = null;
		
		//拆分部分
		byte buffer[] = new byte[size];
		int len;
		int count = 1;
		while((len = in.read(buffer)) != -1) {
			File outfile = new File(dir,count++ + ".part");
			out = new FileOutputStream(outfile);
			out.write(buffer, 0, len);
			out.close();
		}
		
		//属性部分
		FileOutputStream prop = new FileOutputStream(new File(dir,count + ".property"));
		Properties properties = new Properties();
		properties.setProperty("time", count + "");
		properties.setProperty("fileName", file.getName());
		properties.store(prop, "This is prop file");
		
		in.close();
		prop.close();
	}
	
	public static void main(String[] args) throws IOException {
		splite("haha.mp3","E:\\eclipse-workspace\\j2ee\\haha");
	}
}
