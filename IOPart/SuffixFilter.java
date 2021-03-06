package IOPart;

import java.io.File;
import java.io.FilenameFilter;

public class SuffixFilter implements FilenameFilter{
	private String suffix;
	
	public SuffixFilter(String suffix) {
		this.suffix = suffix;
	}

	@Override
	public boolean accept(File dir, String name) {
		return name.endsWith(suffix);
	}

}
