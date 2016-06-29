/**
 * 
 */
package iai_demo;

/**
 * @author orenfromberg@gmail.com
 * Implementation class for a text file IAI data source.
 */
public class IaiTextData implements IaiData {

	/**
	 * filename of IAI data source
	 */
	private String filename;
	
	/* (non-Javadoc)
	 * @see iai_demo.IaiData#getData()
	 */
	@Override
	public String getData() {
		// TODO Auto-generated method stub
		return null;
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

}
