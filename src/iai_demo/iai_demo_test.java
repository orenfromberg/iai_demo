/**
 * 
 */
package iai_demo;

import java.io.FileNotFoundException;
import java.io.IOException;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author orenf
 *
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
		String filename = "resources/iai_data2.txt";
		IaiTextData t = new IaiTextData(filename);
		@SuppressWarnings("unused")
		String data = t.getData();
	}
	
	@Test(expected = NullPointerException.class)
	public void filename_is_null() throws NullPointerException, FileNotFoundException {
		String filename = null;
		IaiTextData t = new IaiTextData(filename);
		@SuppressWarnings("unused")
		String data = t.getData();
	}

	@Test
	public void file_exists() throws FileNotFoundException {
		String filename = "resources/iai_data.txt";
		IaiTextData t = new IaiTextData(filename);
		String data = t.getData();
		assert(data != null);
	}
}
