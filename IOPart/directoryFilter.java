package IOPart;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

public class directoryFilter implements FileFilter{

	@Override
	public boolean accept(File pathname) {
		return pathname.isDirectory();
	}
}
