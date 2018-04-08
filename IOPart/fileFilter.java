package IOPart;

import java.io.File;
import java.io.FileFilter;

public class fileFilter implements FileFilter{

	@Override
	public boolean accept(File pathname) {
		return pathname.isFile();
	}

}
