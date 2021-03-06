/**
 * 
 */
package iai_demo;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * @author orenfromberg@gmail.com
 * Implementation class for a text file IAI data source.
 */
public class IaiDataTextSource implements ReadableIaiData {

	/**
	 * filename of IAI data source
	 */
	private String filename;
	
	/**
	 * @param filename
	 */
	public IaiDataTextSource(String filename) {
		super();
		this.filename = filename;
	}

	/**
	 * @return the filename
	 */
	public String getFilename() {
		return filename;
	}

	/**
	 * @param filename the filename to set
	 */
	public void setFilename(String filename) {
		this.filename = filename;
	}
	
	/* (non-Javadoc)
	 * @see iai_demo.IaiData#getData()
	 * Reading IAI data from local text files can cause the following
	 * exceptions to be thrown: FileNotFoundException and NullPointerException.
	 */
	@Override
	public String readIaiData() throws FileNotFoundException, NullPointerException{
		if (this.filename == null)
			throw new NullPointerException("filename is not initialized.");
		
        String content = null;
        try {
			content = new String(Files.readAllBytes(Paths.get(this.filename)));
		} catch (IOException e) {
			e.printStackTrace();
			throw new FileNotFoundException();
		}
		return content;
	}
}
