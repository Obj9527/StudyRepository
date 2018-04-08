package IOPart;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Properties;
import java.util.Iterator;

public class propertyTest {
	public static void main(String[] args) throws IOException {
		ArrayList<InputStream> aList = new ArrayList<InputStream>();
		
		for (int i = 1; i < 4; i++) {
			aList.add(new FileInputStream(i + ".txt"));
		}
							
		Enumeration<InputStream> en = Collections.enumeration(aList);
		
		BufferedInputStream bStream = new BufferedInputStream(new SequenceInputStream(en));
		BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("col.txt"));
		byte buffer[] = new byte[1024];
		int len;
		while((len = bStream.read(buffer)) != -1) {
			out.write(buffer,0,len);
		}
		
		out.close();
		bStream.close();
	}
}
