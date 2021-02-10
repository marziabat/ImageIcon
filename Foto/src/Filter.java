import java.io.File;

import javax.swing.filechooser.FileFilter;

public class Filter extends FileFilter{

	@Override
	public boolean accept(File f) {
		if(f.isDirectory()) return true;
		String fname = f.getName().toLowerCase();
		return fname.endsWith("jpg");
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "immagine";
	}

}
