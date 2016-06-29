/**
 * 
 */
package iai_demo;

import java.io.FileNotFoundException;
import java.net.SocketException;

/**
 * @author orenfromberg@gmail.com
 * interface for getting data from an IAI data source.
 */
public interface IaiData {
	
	/**
	 * @return String with IAI data
	 * @throws FileNotFoundException, SocketException, NullPointerException
	 */
	String getData() throws FileNotFoundException, SocketException, NullPointerException;
}
