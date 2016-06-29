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
public class IaiTextData implements IaiData {

	/**
	 * filename of IAI data source
	 */
	private String filename;
	
	/**
	 * @param filename
	 */
	public IaiTextData(String filename) {
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
	 */
	@Override
	public String getData() throws FileNotFoundException, NullPointerException{
		// read file into stream, try-with-resources
		if (this.filename == null)
			throw new NullPointerException("filename is not initialized.");
		
        String content = null;
        try {
			content = new String(Files.readAllBytes(Paths.get(this.filename)));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new FileNotFoundException();
		}
		return content;
	}
}
