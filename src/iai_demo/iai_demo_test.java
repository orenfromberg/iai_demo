/**
 * 
 */
package iai_demo;

import java.io.FileNotFoundException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author orenfromberg@gmail.com
 * Simple set of unit tests for IaiTextData
 */
public class iai_demo_test {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test(expected = FileNotFoundException.class)
	public void file_does_not_exist() throws FileNotFoundException {
		String filename = "resources/wrong_file.txt";
		IaiTextData source = new IaiTextData(filename);
		@SuppressWarnings("unused")
		String data = source.getData();
	}
	
	@Test(expected = NullPointerException.class)
	public void filename_is_null() throws NullPointerException, FileNotFoundException {
		String filename = null;
		IaiTextData source = new IaiTextData(filename);
		@SuppressWarnings("unused")
		String data = source.getData();
	}

	@Test
	public void file_exists_all_good() throws FileNotFoundException {
		String filename = "resources/iai_data.txt";
		IaiTextData source = new IaiTextData(filename);
		String data = source.getData();
		assert(data != null);
	}
}
