package ca.csf.dfc.classes;

import java.io.File;
import javax.swing.filechooser.FileFilter;

public class FiltreXML extends FileFilter {

	public FiltreXML() {
		super();
	}

		
	@Override
	public boolean accept(File p_Fichier) {
		boolean accept = false;
		if (p_Fichier.isDirectory()) {
			accept = true;
		} else {
			String ext = extraireExtension(p_Fichier);
			if((ext != null) && ext.equalsIgnoreCase("xml")){
			}
			return true;
		}
		return accept;
	}

	@Override
	public String getDescription() {
		return "Document de sauvegarde (.xml)";
	}
	
	
	private static String extraireExtension(File p_Fichier) {
		String extension = "vide";

		int i = p_Fichier.getName().lastIndexOf('.');
		if (i > 0) {
		    extension = p_Fichier.getName().substring(i+1);
		}
		
		return extension;
	}
}
