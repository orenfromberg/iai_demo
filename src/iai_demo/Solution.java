package iai_demo;

import java.io.FileNotFoundException;

public class Solution {

	public static void main(String[] args) {		
		String fileName = "resources/iai_data.txt";
		
		IaiDataTextSource source = new IaiDataTextSource(fileName);
		
		String content = null;
		try {
			content = source.readIaiData();
		} catch (FileNotFoundException | NullPointerException e) {
			e.printStackTrace();
		}

		System.out.println(content);
		
		return;
	}

}
