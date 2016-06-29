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
	 * This method supports throwing exceptions that are related to
	 * Input/Output with local files, sockets, serial ports, etc.
	 * Classes that implement this interface can choose which exceptions
	 * they want to throw from the list of exceptions here.
	 * @return String with IAI data
	 * @throws FileNotFoundException, SocketException, NullPointerException
	 */
	String getData() throws FileNotFoundException, SocketException, NullPointerException;
}
